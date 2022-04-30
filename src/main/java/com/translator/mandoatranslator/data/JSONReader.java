package com.translator.mandoatranslator.data;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.translator.mandoatranslator.domain.Dictionary;
import com.translator.mandoatranslator.domain.Translation;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class JSONReader {
    public static void Read() throws IOException {
        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/com/translator/mandoatranslator/mandoaDictionary.json"));
        List<Translation> tempTranslations = gson.fromJson(reader, new TypeToken<List<Translation>>() {}.getType());
        reader.close();
        Dictionary.translations = tempTranslations;
//        System.out.println(Dictionary.translations.get(0).getEnglishWord());
    }


}
