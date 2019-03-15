//
// Object-oriented Game of Life
// for PGR103 Object Oriented Programming at Kristiania University College
//

import java.util.Random;

class World
{
    private int width;
    private int height;
    private int[] currentWorld; // This is the world we read from
    private int[] nextWorld;    // This is the world we write to
    private Random random = new Random();

    // Constructor
    public World(int width, int height)
    {
        this.width = width;
        this.height = height;

        // Create and initialize the world
        currentWorld = new int[width * height];
        nextWorld = new int[width * height];
        clear();
    }

    // Clear the world
    public void clear()
    {
        for(int i = 0; i < width * height; i++)
            currentWorld[i] = 0;
    }

    // Create a random world
    public void randomize()
    {
        for(int i = 0; i < width * height; i++)
            currentWorld[i] = random.nextInt(2);
    }

    // Set all cells of the world
    // Number of given cells must be equal to the number of cells in the world!
    public void setWorld(int ... cells)
    {
        // Must fill entire world!
        if(cells.length != width * height)
            return;

        for(int i = 0; i < width * height; i++)
            currentWorld[i] = cells[i];
    }

    // World width
    public int getWidth()
    {
        return width;
    }

    // World height
    public int getHeight()
    {
        return height;
    }

    // Count the number of neighbours of any given cell in an infinitely repeating world
    private int countNeighrbours(int x, int y)
    {
        int aliveNeightbours = 0;

        // Count alive neighbours
        for(int i = -1; i < 2; i++)
        {
            for(int j = -1; j < 2; j++)
            {
                // Don't count the current cell
                if(i == 0 && j == 0)
                    continue;

                if(getCell(wrapX(x + i), wrapY(y + j)) != 0)
                    aliveNeightbours++;
            }
        }
        return aliveNeightbours;
    }

    // Wrap X and Y coordintes to create an infinitely repeating world
    public int wrapX(int x)
    {
        if(x < 0)       x += width;
        if(x >= width)  x -= width;
        return x;
    }
    public int wrapY(int y)
    {
        if(y < 0)       y += height;
        if(y >= height) y -= height;
        return y;
    }

    // Get a current cell
    public int getCell(int x, int y)
    {
        return currentWorld[(y * width) + x];
    }

    // Kill cell in current world
    public void killCell(int x, int y)
    {
        currentWorld[(y * width) + x] = 0;
    }

    // Populate cell in current world
    public void populateCell(int x, int y)
    {
        currentWorld[(y * width) + x] = 1;
    }

    // Kill cell in next world
    private void killNextCell(int x, int y)
    {
        nextWorld[(y * width) + x] = 0;
    }

    // Populate cell in next world
    private void populateNextCell(int x, int y)
    {
        nextWorld[(y * width) + x] = 1;
    }

    // Run 1 simulation step
    public void tick()
    {
        for(int y = 0; y < height; y++)
        {
            for(int x = 0; x < width; x++)
            {
                // Game of Life algorithm
                int cell = getCell(x, y);
                int neighbours = countNeighrbours(x, y);




                // Death by under-population
                if(neighbours < 2)
                    killNextCell(x, y);
                    // Stabile population
                else if(cell != 0 && neighbours == 2)
                    populateNextCell(x, y);
                    // Growing population
                else if(neighbours == 3)
                    populateNextCell(x, y);
                    // Death by over-population
                else if(neighbours > 3)
                    killNextCell(x, y);
                    // Blank cell, but we must make sure to clear any garbage in it from the previous world
                else
                    killNextCell(x, y);
            }
        }

        // Swap the worlds
        int[] t = currentWorld;
        currentWorld = nextWorld;
        nextWorld = t;
    }

    public String toString()
    {
        String s = "";
        for(int i = 0; i < width * height; i++)
        {
            s += currentWorld[i] != 0 ? "O" : " ";
            if(i > 0 && (i % width == 0))
                s += "\n";
        }
        return s;
    }
}

public class GameOfLifeCytlan
{
    public static World world;

    public static void main(String[] args)
    {
        System.out.println("Game of Life");
        System.out.println("------------");

		/*
		// Figure-8 oscillator
		world = new World(16, 16);
		world.setWorld(
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,
			0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,
			0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,
			0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,
			0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
		);
		*/
        // Random world
        world = new World(60, 60);
        world.randomize();

        String separator = "";
        for(int i = 0; i < world.getWidth() + 1; i++)
            separator += "-";

        // Print initial world
        System.out.println(world);
        try
        {
            while(true)
            {
                // Run simulation
                world.tick();

                // Print resulting world
                System.out.println(separator);
                System.out.println(world);

                // Delay, so that we can see what's going on :)
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e)
        {
            // Ignore
        }
    }
}