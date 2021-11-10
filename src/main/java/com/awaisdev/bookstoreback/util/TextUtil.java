package com.awaisdev.bookstoreback.util;

public class TextUtil {
    public String sanitize (String textToSenitize){
        return textToSenitize.replaceAll("\\s+", "");


    }
}
