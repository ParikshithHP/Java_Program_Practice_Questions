package org.testing.project.javaInterviewPrograms;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "malayalam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (rev.equals(str)) {
            System.out.println("is palindrome string ");
        } else {
            System.out.println("is not a palindrome string");
        }
    }
}
