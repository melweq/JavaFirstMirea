package ru.mirea.task14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

    }

    private static void taskThree() {
        Pattern pattern = Pattern.compile("(?:\\s|^)(\\d+(\\.\\d{1,2})?) \\b(?:USD|RUB|EU)\\b");
        Matcher matcher = pattern.matcher("2 USD, 5.12 RUB, 10 ER, 12 EU");
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }

    private static void taskTwo() {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher("abcdefghijklmnopqrstuv18340");
        Matcher matcher1 = pattern.matcher("notthis");
        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
    }
}
