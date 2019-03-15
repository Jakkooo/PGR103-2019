//Solution by Cytlan

    public class StringSplosion2
    {
        public static void main(String[] args)
        {
            System.out.println(stringSplosion("Code")); // CCoCodCode
            System.out.println(stringSplosion("abc"));  // aababc
            System.out.println(stringSplosion("ab"));   // aab
        }

        public static String stringSplosion(String str)
        {
            String s = "";
            int len = str.length();
            for(int i = 0; i <= len; i++)
            {
                s += str.substring(0, i);
            }
            return s;
        }
}
