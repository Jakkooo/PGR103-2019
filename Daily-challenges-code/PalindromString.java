//Solution by Trusefukter

public class PalindromString {

    static String checkForPalindrome (String x) {

        int strLength = x.length();
        String xBackwards = "";

        for (int i = strLength; i > 0 ; i--) {
            xBackwards += x.charAt(i-1);
        }
        System.out.println(xBackwards);

        if (xBackwards.equals(x)) {
            return "True! " + x + " is a palindrome.";
        } else if (!xBackwards.equals(x)) {
            return "False! " + x + " is not a palindrome.";
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("torot"));
    }

}
