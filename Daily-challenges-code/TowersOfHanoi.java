import java.util.Scanner;

public class TowersOfHanoi {

    public void solve(int n, String start, String auxiliary, String end) {
        if (n == 1) {
            System.out.println(start + " -> " + end);
        } else {
            solve(n - 1, start, end, auxiliary);
            System.out.println(start + " -> " + end);
            solve(n - 1, auxiliary, start, end);
        }
    }


    public static void solveRedbaron(int n,String start, String aux, String end){
        if(n==1){
            System.out.println("Move from rod " + start + " to rod " + end);
            return;
        }
        else{
            solveRedbaron(n-1,start,end,aux);
            System.out.println("Move from rod " + start + " to rod " + end );
            solveRedbaron(n-1,aux,start,end);
        }
    }


    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();

        //Michael
        towersOfHanoi.solve(discs, "A", "B", "C");
        //Red_baron
        System.out.println("Solution of Red_Baron");
        towersOfHanoi.solveRedbaron(discs, "A", "B", "C");
    }
}
