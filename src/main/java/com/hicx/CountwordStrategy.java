package com.hicx;

public class CountwordStrategy implements AnalyticsStrategy {
    @Override
    public String analysis(String data) {
          return  countWords(data);
    }
    private String countWords(String input) {
        String[] words = input.split("\\s+");
        return String.valueOf(words.length);
    }
}
