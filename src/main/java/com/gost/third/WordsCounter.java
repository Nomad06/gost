package com.gost.third;

import java.util.*;

public class WordsCounter {
    public static Map<String, Integer> count(String text){
        Map<String, Integer> words = new HashMap<>();
        if(text == null || text.isEmpty()) return words;
        String word;
        String[] splittedWords;
        StringTokenizer tokenizer = new StringTokenizer(text);
        while (tokenizer.hasMoreTokens()){
            word = tokenizer.nextToken();
            splittedWords = word.split("[.,!?;]");
            for(String str : splittedWords){
                fill(words, str.trim().toLowerCase());
            }
        }

        return words;
    }


    private static void fill(Map<String, Integer> words, String word){
        if(words.containsKey(word)){
            words.computeIfPresent(word, (key, value) -> value + 1);
        }
        else {
            words.put(word, 1);
        }
    }
}
