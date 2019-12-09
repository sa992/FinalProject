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
        languages.put("malayalam", "m1");
        l.add("malayalam");

        languages.put("english", "en");
        l.add("english");

        languages.put("tamil", "ta");
        l.add("tamil");

        languages.put("ukranian", "uk");
        l.add("ukranian");

        languages.put("tagalog", "t1");
        l.add("tagalog");

        languages.put("latin", "la");
        l.add("latin");

        languages.put("danish", "da");
        l.add("danish");

        languages.put("afrikaans", "af");
        l.add("afrikaans");

        languages.put("dutch", "n1");
        l.add("dutch");

        languages.put("danish", "da");
        l.add("danish");
        languages.put("croatian", "hr");
        l.add("croatian");
        languages.put("czech", "cs");
        l.add("czech");
        languages.put("frisian", "fy");
        l.add("frisian");
        languages.put("georgian", "ka");
        l.add("georgian");
        languages.put("hebrew", "he");
        l.add("hebrew");
        languages.put("indonesian", "id");
        l.add("indonesian");
        languages.put("danish", "da");
        l.add("danish");
        languages.put("lao", "lo");
        l.add("lao");
        languages.put("tajik", "tg");
        l.add("tajik");
        languages.put("thai", "th");
        l.add("thai");
        languages.put("zulu", "zu");
        l.add("zulu");

    }
}
