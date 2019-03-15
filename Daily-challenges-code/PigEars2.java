//Solution by red_baron

public class PigEars2 {

        public static int pigEars(int num){
            if(num<=0)
                return 0;
            if(num==1)
                return 2;
            return 2+pigEars(num-1);

        }

        public static void main(String [] args){
            System.out.println(pigEars(0));
            System.out.println(pigEars(1));
            System.out.println(pigEars(60));
        }
    }

