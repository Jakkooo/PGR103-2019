//Solution by red_baron

import java.util.*;


public class StringSplosion {


        public static String stringSplosion(String s){
            int sLength=s.length();
            String returnString="";
            for(int i=0;i<sLength;i++){
                for(int j=0;j<=i;j++){
                    returnString+=s.charAt(j);
                }
            }
            return returnString;
        }

        public static String stringSplosionTwo(String s){
            String returnString="";
            for(int i=1;i<=s.length();i++){
                returnString=returnString+s.substring(0,i);
            }
            return returnString;
        }
        public static void main(String [] args){
            Scanner inn=new Scanner(System.in);
            String newString=inn.next();
            System.out.println(stringSplosion(newString));
            System.out.println(stringSplosionTwo(newString));
        }
    }


