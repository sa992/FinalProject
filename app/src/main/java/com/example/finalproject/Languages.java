package com.example.finalproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Languages {
    private static Map<String, String> languages = new HashMap<>();
    private static List<String> l  = new ArrayList<>();
    public static Map<String, String> getLanguages() {
        write();
        return languages;
    }
    public static List<String> getL() {
        return l;
    }
    public static void write() {
        languages.put("afrikaans", "af");
        l.add("afrikaans");
        languages.put("albanian", "sq");
        l.add("albanian");
        languages.put("amharic", "am");
        l.add("amharic");
        languages.put("arabic", "ar");
        l.add("arabic");
        languages.put("armenian", "hy");
        l.add("armenian");
    }
}
