//Solution by Krister
import java.util.Scanner;

public class StringSplosion3 {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            System.out.println("Type a word to explode it.");
            String pureText = scan.nextLine();

            for(int i = 0; i <= pureText.length(); i++){
                System.out.print(pureText.substring(0,i));
            }
        }
}
