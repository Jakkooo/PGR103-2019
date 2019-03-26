public class DC24 {

//fizz array
    public static int[] fizzArray(int start, int end) {
        int n = end - start;
        int[] result = new int[n];

        for (int i = 0; i < n; i++)
        result[i] = start++;
        return result;
    }

//test class
    public static void main(String[] args) {

        for(int i = 0; i<fizzArray(2,5).length;i++)
        System.out.println(fizzArray(2,5)[i]);

    }



}
