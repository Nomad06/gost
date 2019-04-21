package com.gost.third;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> words = WordsCounter.count("My name is bobo.I am twenty years old!Adwca #12dsac.Name is bobo Twenty years me.");
        words.entrySet().stream().sorted(Map.Entry. <String, Integer> comparingByValue().reversed())
                .forEachOrdered((entry) -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
