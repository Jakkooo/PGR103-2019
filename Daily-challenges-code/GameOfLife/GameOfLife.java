// A simple Java program to implement Game of Life
public class GameOfLife
{
    public static void main(String[] args)
    {
        int M = 10, N = 10;

        /*
        * Grid in initialized with zeros representing the dead cells and ones representing alive cells.
        * The generate() function loops through every cell and counts it’s neighbors.
        * Based on that values, the aforementioned rules are implemented.
        * The following implementation ignores the edge cells as it
        * supposed to be played on an infinite world.
        * */

        // Intiliazing the grid of cells.
        // TODO: Add your code here!
        // TODO: Try to initialize the array randomly.
        // TODO: Note: we ignore the edges for our simple example.
        int[][] grid =  {{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                        { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        // Displaying the grid of cells at the start.
        System.out.println("Original Generation");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (grid[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        nextGeneration(grid, M, N);
    }

    // Function to print next generation
    static void nextGeneration(int grid[][], int M, int N)
    {
        //Future grid containing the next generation of cells.
        int[][] future = new int[M][N];

        // Loop through every cell in the grid
        for (int l = 1; l < M - 1; l++)
        {
            for (int m = 1; m < N - 1; m++)
            {

                // Find the number of cell neihgbours that are alive
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        aliveNeighbours += grid[l + i][m + j];

                // The cell needs to be subtracted from
                // its neighbours as it was counted before
                        aliveNeighbours -= grid[l][m];

                // TODO: Implementing the Rules of Life
                // TODO: Add your code here!!!

                // TODO: Cell is lonely and dies

                // TODO: Cell dies due to over population

                // TODO: A new cell is born

                // TODO: Remains the same

            }
        }

        // Print the next generation of cells
        System.out.println("Next Generation");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (future[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        //TODO: Up for a challenge try to implement a loop that allows several generations.
    }
}