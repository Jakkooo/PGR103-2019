import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Grid grid = new Grid();
        System.out.println("=== Select a preset using numbers on the list: ===");
        String[] possiblePresets = {
                "= 1: Figure 8 (12x12)",
                "= 2: Glider (12x12)",
                "= 3: Small Exploder (20x20)",
                "= 4: Ten Cell Row (20x20)",
                "= Any other number will result in a randomly generated 12x12 structure ="
        };
        for (String line: possiblePresets){
            System.out.println(line);
        }
        int selectedValue = scan.nextInt();
        scan.nextLine(); //For the linefeed
        int[][] firstGen = grid.getPreset(selectedValue);
        grid.createGen(firstGen);
        grid.printGen(firstGen);
        int gridW = grid.getGridWidth();
        int gridH = grid.getGridHeight();
        int[][] grid1 = grid.getGrid();

        System.out.println("=== How many generations do you want to simulate? ===");
        int amountOfGens = scan.nextInt();
        for(int i = 0; i < amountOfGens - 1; i++) {
            gridW = grid.getGridWidth();
            gridH = grid.getGridHeight();
            grid1 = grid.getGrid();
            grid.nextGen(grid1, gridH, gridW);
        }
    }
}
