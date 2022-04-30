package com.translator.mandoatranslator.applogic;

import com.translator.mandoatranslator.domain.Dictionary;
import com.translator.mandoatranslator.domain.Translation;
import com.translator.mandoatranslator.domain.TranslationDirection;

import java.util.ArrayList;

public class Machinations {

    public static String Translate(TranslationDirection translationDirection, String sourceText) {
        String[] sourceWords = sourceText.split(" ");
        ArrayList<String> returnWords = new ArrayList<>();
        String returnText = "";
        for (String word : sourceWords) {
            String translatedWord = getTranslatedWord(word, translationDirection);
            if (translatedWord.endsWith("?")) {
                translatedWord = getTranslatedWord(translatedWord.substring(0, translatedWord.length() -1), translationDirection);
                translatedWord += "?";
            }
            returnWords.add(translatedWord);
        }
//        TODO: fix words not translating when any punctuation is at the end of a word.
        String lastWordInList = returnWords.get(returnWords.size() - 1);

        if (translationDirection == TranslationDirection.ENGLISHTOMANDOA && lastWordInList.endsWith("?")) {
//                Add tion to the front of the list.
            returnWords.add(0, "tion");
        } else if (translationDirection == TranslationDirection.MANDOATOENGLISH && sourceWords[0].equals("tion")) {
//                Add the questionmark to the end of returnwords, and delete tion from the list.
            returnWords.add("?");
            returnWords.remove(0);
        }
        for (String word : returnWords) {
            returnText = returnText.concat(word + " ");
        }
        return returnText;
    }

    public static String getTranslatedWord(String word, TranslationDirection translationDirection){
//        Find the correct translation
        for (Translation translation : Dictionary.translations) {
            if (translationDirection == TranslationDirection.ENGLISHTOMANDOA&& word.equals(translation.getEnglishWord())){
//                More complicated stuff can go here later, it just needs to work for now
                return translation.getMandoaWord();
            } else if (translationDirection == TranslationDirection.MANDOATOENGLISH && word.equals(translation.getMandoaWord())){
//                Ditto here
                return translation.getEnglishWord();
            }
        }
//        If the correct translation could not be found, return the original word.
        return word;
    }
}
