//Solution by Krister

public class FourChecker {

        public static void main(String[] args){
            System.out.println(fourCheck(1,2,3));
            System.out.println(fourCheck(1,2,4));
            System.out.println(fourCheck(1,4,3));

        }

        public static int fourCheck(int first, int second, int third){
            int[] values = {first,second,third};
            int result = 0;
            for (int i = 0; i < 3; i++){
                if (values[i] != 4) {
                    result += values[i];
                } else {
                    return result;
                }
            }
            return result;
        }
}
