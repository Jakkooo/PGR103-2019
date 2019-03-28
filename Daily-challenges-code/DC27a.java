public class DC27a {

    static public String noZeeS(String str) {
        if (str.equals("")) return str;
        if (str.charAt(0) == 'z') return noZeeS(str.substring(1));
        else return str.charAt(0) + noZeeS(str.substring(1));
    }



    public static void main(String[] args) {

        System.out.println(noZeeS("zhzezlzlzo"));
        System.out.println(noZeeS("zwzozrzlzdz"));
        System.out.println(noZeeS("zz"));


    }


}
