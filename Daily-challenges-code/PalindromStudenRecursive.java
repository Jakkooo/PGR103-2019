//Solution by TommyHama


import java.util.Scanner;


    public class PalindromStudenRecursive {
        // User input open for any type of checking
        //try to have variables on top methods after
        public static Scanner scan = new Scanner(System.in);
        public static String userInput = scan.nextLine();
        static int i = 0;
        static int j = userInput.length()-1; //string length - 1 gives you the last index



        public static void main(String[] args) {
            System.out.println(paliChecker(userInput));
        }

        // this doesnt work it gives you 0, userInput.lastIndexOf(userInput); // Try use last index as start

        public static String paliChecker(String number) {

            System.out.println(number.length());
            System.out.println(number.charAt(0));

            //check for palindroms with uneven numbers like "annna"
            if (number.charAt(i) == number.charAt(j) && i == j) { // Run if index is same
                String done = "Same number index hit and number is palindrome";
                return done;
            }
            //check for palindroms with even numbers like "anna"
            else if (number.charAt(i) == number.charAt(j) && i > j) {
                String done = "Same number index hit and number is palindrome";
                return done;
            } else if (number.charAt(i) == number.charAt(j)) {
                System.out.println(i + " " + j);
                i++;
                j--;
                return paliChecker(number);
            } else {
                String failed = "Condition not work, its not a plaindrom";
                return failed;
            }
        }


}
