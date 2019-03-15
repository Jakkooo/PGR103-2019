//Solution by Cytlan


public class JinxedSum {
        public static void main(String[] args)
        {
            System.out.println(jinxedSum(1, 2, 3));
            System.out.println(jinxedSum(1, 2, 4));
            System.out.println(jinxedSum(1, 4, 3));
        }

        public static int jinxedSum(int a, int b, int c)
        {
            if(a == 4)
                return 0;
            if(b == 4)
                return a;
            if(c == 4)
                return a + b;
            return a + b + c;
        }

}
