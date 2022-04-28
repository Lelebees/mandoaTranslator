package com.translator.mandoatranslator.Domain;

import com.translator.mandoatranslator.Data.JSONReader;

import java.util.ArrayList;

public class Dictionary {
    private static ArrayList<Translation> translations = null;
//TODO: Fill arraylist with translations using JSONReader.
    public static ArrayList<Translation> getTranslations() {
        return translations;
    }
}
