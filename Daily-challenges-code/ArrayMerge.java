// Solution by Cytlan
// Merge two arrays
// For PGR103 Object Oriented Programming at Kristiania University College
//

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMerge
{
    public static String[] mergeTwo(String[] a, String[] b, int length)
    {
        ArrayList<String> n = new ArrayList<String>();

        int bLen = b.length;
        int bIndex = 0;
        int aLen = a.length;
        int aIndex = 0;

        // Loop until both arrays have reached the end
        while(aIndex < aLen || bIndex < bLen)
        {
            String aStr = aIndex < aLen ? a[aIndex] : "";
            String bStr = bIndex < bLen ? b[bIndex] : "";
            int res = -1;

            // Both arrays have elements reamining - Compare as usual
            if(aIndex < aLen && bIndex < bLen)
                res = aStr.compareTo(bStr);
                // Array B has no more elements, but there's still more in A - Copy from A
            else if(aIndex < aLen && bIndex >= bLen)
                res = -1;
                // Array A has no more elements, but there's still more in B - Copy from B
            else if(aIndex >= aLen && bIndex < bLen)
                res = 1;

            // The strings are equal - Keep a
            if(res == 0)
            {
                n.add(aStr);
                aIndex++;
                bIndex++;
            }
            // bStr is greater than aStr - Keep a
            else if(res < 0)
            {
                n.add(aStr);
                aIndex++;
            }
            // aStr is greater than bStr - Keep b
            else if(res > 0)
            {
                n.add(bStr);
                bIndex++;
            }
        }

        // Convert ArrayList to array
        String[] nArr = n.toArray(new String[n.size()]);

        // If N is smaller than the given length, return the whole N
        int newLen = length;
        if(nArr.length < newLen)
            newLen = nArr.length;

        // Return desired elements
        return Arrays.copyOfRange(nArr, 0, newLen);
    }

    public static void main(String[] args)
    {
        String[] a = {"a", "c", "d", "f"};
        String[] b = {"b", "f", "x", "z"};
        String[] c = mergeTwo(a, b, 4);
        for(int i = 0; i < c.length; i++)
            System.out.print(c[i]+(i < c.length - 1 ? ", " : ""));
        System.out.print("\n");
    }
}