package com.hicx;

public class CountDotsStrategy implements AnalyticsStrategy {
    @Override
    public String analysis(String data) {
       return countDots(data);
    }
    private String countDots(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') {
                count++;
            }
        }
        return String.valueOf(count);
    }
}
