package com.translator.mandoatranslator.Applogic;

import com.translator.mandoatranslator.Domain.Dictionary;
import com.translator.mandoatranslator.Domain.Translation;
import com.translator.mandoatranslator.Domain.TranslationDirection;

import java.util.ArrayList;

public class Machinations {

    public static String Translate(TranslationDirection translationDirection, String sourceText) {
        String[] sourceWords = sourceText.split(" ");
        ArrayList<String> returnWords = new ArrayList<>();
        String returnText = "";
        for (String word : sourceWords) {
            returnWords.add(getTranslatedWord(word, translationDirection));
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
