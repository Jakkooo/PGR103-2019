//Solution by Cytlan

import java.util.Scanner;

public class FizzString
{
    public static void main(String[] args)
    {
        System.out.println(fizzString("fig")); // Fizz
        System.out.println(fizzString("dib")); // Buzz
        System.out.println(fizzString("fib")); // FizzBuzz
    }

    public static String fizzString(String str)
    {
        boolean f = str.startsWith("f");
        boolean b = str.endsWith("b");
        if(f && b)
            return "FizzBuzz";
        if(f)
            return "Fizz";
        if(b)
            return "Buzz";
        return str;
    }
}
