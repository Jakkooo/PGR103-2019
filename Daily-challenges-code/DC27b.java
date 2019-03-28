public class DC27b {



   static public String starItUp(String str) {
        if (str.equals("") || str.length() == 1) return str;
        return str.charAt(0) + "*" + starItUp(str.substring(1));
    }



    public static void main(String[] args) {

                System.out.println(starItUp("hello"));
                System.out.println(starItUp("world"));
                System.out.println(starItUp("ab"));


    }


}
