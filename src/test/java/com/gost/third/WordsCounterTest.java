package com.gost.third;

import com.gost.third.WordsCounter;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordsCounterTest {
    @Test
    public void countTest(){
        Map<String, Integer> words = new HashMap<>();
        words.put("my", 2);
        words.put("name", 2);
        words.put("is", 2);
        words.put("bobo", 1);
        words.put("bob", 1);

        Map<String, Integer> result = WordsCounter.count("My name is bobo. Bob is my name!");
        Assert.assertEquals(result.size(), words.size());
        Assert.assertTrue(equalsMap(result, words));
    }

    @Test
    public void countNullTest(){
        Map<String, Integer> result = WordsCounter.count(null);
        Assert.assertEquals(result.size(), 0);
    }

    @Test
    public void countEmptyTest(){
        Map<String, Integer> result = WordsCounter.count(null);
        Assert.assertEquals(result.size(), 0);
    }

    @Test
    public void countOneWordTest(){
        Map<String, Integer> words = new HashMap<>();
        words.put("my", 1);
        Map<String, Integer> result = WordsCounter.count("my");
        Assert.assertEquals(result.size(), 1);
        Assert.assertTrue(equalsMap(result, words));
    }

    private boolean equalsMap(Map<String, Integer> result, Map<String, Integer> expected){
        return result.entrySet().stream().allMatch((e) -> e.getValue().equals(expected.get(e.getKey())));
    }
}
