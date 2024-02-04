package plane.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import plane.Circle;
public class CircleUtil 
{
    public static void main(String[] args)
    {
        CircleUtil.writeCircle("C:/Users/huipe/Documents/ELTE_SEMESTER/2/NICOLAS_A0T4ZR_JAVA/LAB7/plane/util/circle.txt");
        System.out.println("hola");

        
    }
    static public void writeCircle(String filename)
    {
        System.out.println("hola");
        try(BufferedReader br = new BufferedReader((new FileReader(filename)))) 
        {
            String line;
            int cnt = 0;
            Double[] arguments = {0.0,0.0,0.0};
            while((line = br.readLine()) != null)
            {
                if(!line.trim().isEmpty())
                {
                    System.out.println(line);
                    try
                    {
                        if( arguments[0] == 0 && cnt == 0)
                        {
                            arguments[0]= Double.parseDouble(line);
                        }
                        else if(arguments[1] == 0 && cnt == 1)
                        {
                            arguments[1]= Double.parseDouble(line);
                        }
                        else if(arguments[2] == 0 && cnt == 2 )
                        {
                            arguments[2]= Double.parseDouble(line);
                        }

                    }
                    catch(IllegalArgumentException e)
                    {
                        
                    }
                    cnt++;
                }
            }
            Circle circle = new Circle(arguments[0], arguments[1], arguments[2]);
            System.out.println(circle.getX() + " " + circle.getY() + " " + circle.getRadious());
            

        }
        catch(IOException e)
        {
            
        }
    }
}
