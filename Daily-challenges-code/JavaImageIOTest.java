//Solution bt Cytlan

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class JavaImageIOTest
{
    static public void JavaImageIOTest()
    {
        // the line that reads the image file
        BufferedImage image = null;
        File file = null;

        // read image
        try
        {
            file = new File("test.jpeg");
            image = ImageIO.read(file);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

        //To get image width and height you can do the following
        int width = image.getWidth();
        int height = image.getHeight();

        //print the width and height of the image. An image is basically and array of width times height times colorspace (Red, green, blue)
        System.out.println("Image width is: "+width + " " + "\nImage height is: " + height);

        //Iterating trough the image
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                // Here (x,y)denotes the coordinate of image
                // for modifying the pixel value. You basically iterate trough the pixels of the image
                // one by one and do something with them.
                int pixel = image.getRGB(x,y);

                int alpha = (pixel >> 24) & 0xff;
                int red =   (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue =   pixel & 0xff;

                // Average and normalise the color
                float colorAvg = (float)(red + green + blue) / (float)(255 * 3);

                // Convert to 8 bits
                int grey = (int)(colorAvg * 255.0);

                // Reconstruct the pixel
                pixel = (alpha << 24) | (grey << 16) | (grey << 8) | grey;

                image.setRGB(x, y, pixel);
            }
        }

        // write image to hard disk
        try
        {
            file = new File("out.jpeg");
            ImageIO.write(image, "jpeg", file);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    // Main method
    public static void main(String[] args)
    {
        JavaImageIOTest();
    }
}
