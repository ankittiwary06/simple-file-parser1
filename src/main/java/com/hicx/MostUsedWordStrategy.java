package com.hicx;

import java.util.HashMap;
import java.util.Map;

public class MostUsedWordStrategy implements AnalyticsStrategy{
    @Override
    public String analysis(String data) {

        String result=findMostFrequentWord(data);
        result="most used word is "+result;
        System.out.println(result);
        return result;
    }
    private String findMostFrequentWord(String input) {
        String[] words = input.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        int maxCount = 0;
        String mostFrequentWord = "";

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        return mostFrequentWord;
    }
}
