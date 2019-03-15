public class MergeTwo {

/*
*
*Start with two arrays of strings, A and B, each with its elements in alphabetical order
* and without duplicates. Return a new array containing the first N elements from the two arrays.
* The result array should be in alphabetical order and without duplicates. A and B will both
* have a length which is N or more. The best "linear" solution makes a single pass over A and B, taking advantage of
* the fact that they are in alphabetical order, copying elements directly to the new array.
mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]

*
*
* */



    public static void main(String[] args) {

        String[] stringArrayOne = {"a","c","z","x"};
        String[] stringArrayTwo = {"b","f","z","y"};
        int n = 3;

        String[] mergedArray = new String[n];

        //merge the two aarays
        mergedArray = mergeTwo(stringArrayOne,stringArrayTwo,n);

        //print the result line by line
       for(int i = 0;i<mergedArray.length;i++){

           System.out.print(mergedArray[i]+",");

       }

    }

    //method for merging the array
        public static String[] mergeTwo(String[] a, String[] b, int n) {
        //ouput of the merge
        String out[] = new String[n];
        //helpers for the index
        int aindex =0, bindex=0;

        for(int i=0; i<n; i++)
        {
            //cmp is a helper to compare
            int cmp = a[aindex].compareTo( b[bindex] );
            if(cmp<=0)
            {
                out[i] = a[aindex++];
                if(cmp == 0) bindex++;
            }
            else
            {
                out[i] = b[bindex++];
            }
        }
        return out;
    }

}
