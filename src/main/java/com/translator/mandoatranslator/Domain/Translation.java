package com.translator.mandoatranslator.Domain;

public class Translation {
    private String mandoaWord;
    private String mandoaPronounciation;
    private String englishWord;
//    private String description;

    public Translation(String mandoaWord, String mandoaPronounciation, String englishWord){
        this.mandoaWord = mandoaWord;
        this.mandoaPronounciation = mandoaPronounciation;
        this.englishWord = englishWord;
    }

    public String getEnglishWord() {
        return this.englishWord;
    }

    public String getMandoaPronounciation() {
        return this.mandoaPronounciation;
    }

    public String getMandoaWord() {
        return this.mandoaWord;
    }
}
