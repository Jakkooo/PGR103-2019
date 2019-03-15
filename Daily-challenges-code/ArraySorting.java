//Solution by Zemen79
public class ArraySorting {

        public static void main(String[] args)
        {
            int[] myArray = {3, 2, 1, 5, 4, 7, 8, 6};

            // create result array
            int[] sortedArray = new int[myArray.length];

            //ADD YOUR CODE HERE
            int temp = 0;
            sortedArray = myArray;

            for(int i = 0; i < sortedArray.length; i++)
            {
                for (int j = i + 1; j < sortedArray.length; j++)
                {
                    if (sortedArray[i] > sortedArray[j])
                    {
                        temp = sortedArray[i];
                        sortedArray[i] = sortedArray[j];
                        sortedArray[j] = temp;
                    }
                }
            }

            //Print the sorted array
            for (int i = 0; i < sortedArray.length; i++) {
                System.out.print(sortedArray[i] + ", ");
            }
        }
    }

