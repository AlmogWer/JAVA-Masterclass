package Regex;

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
    }
}
