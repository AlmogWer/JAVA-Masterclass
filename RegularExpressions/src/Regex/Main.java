package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = "I am a string. Yes,I am";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abcDee", "YYY"));
        String secondString = "abcDeeF12GhhiiiiabcDeejkl99z";
        System.out.println(secondString.replaceAll("^abcDee", "YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDee"));
        System.out.println(alphanumeric.matches("^abcDeeF12Ghhiiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("jkl99z$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "I Replaced a letter here"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphanumeric = "abcDeeF12Ghhiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        String hasWhitespace = "I have blanks and \ta tab, and also a new line \n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));
        System.out.println(hasWhitespace.replaceAll("\t", "X"));

        System.out.println(hasWhitespace.replaceAll("\\S", ""));

        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));

        System.out.println(hasWhitespace.replaceAll("\\b", "X"));


        String thirdAlphanumericstring = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(thirdAlphanumericstring.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(thirdAlphanumericstring.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphanumericstring.replaceAll("^abcDe*", "YYY"));
        System.out.println(thirdAlphanumericstring.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(thirdAlphanumericstring.replaceAll("h+i*j", "Y"));


        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>Another p<p>");
        htmlText.append("<p>Another p<p>");
        htmlText.append("<h2>sUMMARY</h2>");
        htmlText.append("<p>Another p<p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());


    }
}
