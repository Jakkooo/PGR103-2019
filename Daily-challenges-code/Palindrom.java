//Solution by Krister

public class Palindrom {

    public static void main(String[] args) {
        System.out.println(palindromeCheck(11));
        System.out.println(palindromeCheck(1125211));
        System.out.println(palindromeCheck(11225211));

    }

    public static String palindromeCheck(int original) {
        int savedOriginal = original;
        int reverseNumber = 0;
        while (original > 0) {
            int lastNumber = original % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            original /= 10;
        }
        if (reverseNumber == savedOriginal) {
            return "It's a palindrome number";
        } else {
            return "It's not a palindrome number";
        }
    }
}

