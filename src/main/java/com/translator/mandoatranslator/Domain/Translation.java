package com.translator.mandoatranslator.Domain;

public class Translation {
    private final String MANDOA;
    private final String PRONUNCIATION;
    private final String ENGLISH;
//    private String description;

    public Translation(String mandoaWord, String mandoaPronounciation, String englishWord){
        this.MANDOA = mandoaWord;
        this.PRONUNCIATION = mandoaPronounciation;
        this.ENGLISH = englishWord;
    }

    public String getEnglishWord() {
        return this.ENGLISH;
    }

    public String getMandoaPronounciation() {
        return this.PRONUNCIATION;
    }

    public String getMandoaWord() {
        return this.MANDOA;
    }
}
