//Solution by Zemen79

import java.util.ArrayList;



public class isThereBalance2
{
    public static void main(String[] args)
    {
        int list[] = {15,15};

        System.out.println(IsThereBalance(list)); // for loop
        System.out.println(IsThereBalance(list, 1)); // recursive
    }

    public static boolean IsThereBalance(int[] list, int split)
    {
        int result1 = 0, result2 = 0;

        // add the left side of the split
        for(int i = 0; i < split; i++)
            result1 += list[i];

        // add the right side of the split
        for(int i = split; i < list.length; i++)
            result2 += list[i];

        // if both sides are equal return true
        if(result1 == result2)
            return true;
        else // reset results
        { result1 = 0; result2 = 0; }

        // return false if list can not be split anymore
        if(split == list.length - 2)
            return false;

        // else increment split and try again
        if(IsThereBalance(list, split + 1))
            return true;

        return false;
    }

    public static boolean IsThereBalance(int[] list)
    {
        int result1 = 0, result2 = 0;

        for(int s = 1; s < list.length; s++)
        {
            // add the left side of the split
            for (int i = 0; i < s; i++)
                result1 += list[i];

            // add the right side of the split
            for (int i = s; i < list.length; i++)
                result2 += list[i];

            // if both sides are equal return true
            if (result1 == result2)
                return true;
            else // reset results
            {
                result1 = 0;
                result2 = 0;
            }
        }

        return false;
    }
}