package text.to.numbers;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import org.junit.platform.commons.function.Try;

public class SingleLineFile 
{
    public static int addNumbers(String filename) throws IOException
    {
        try (BufferedReader br = new BufferedReader(new FileReader(filename));)
        {
            List<String> words = new ArrayList<>();
            String line = br.readLine();
            if(line == null) throw new IllegalArgumentException("Empty file");
            String [] parts = line.split(" ");
            int retval = 0;
            for(String part: parts)
            {
                try
                {
                    retval += Integer.parseInt(part);
                    //System.out.println(retval);
                }
                catch(NumberFormatException e)
                {
                    System.err.println("Invalid: " + e);
                    words.add(part);
                }
            
            }
            if(!words.isEmpty())
            {
                try(BufferedWriter bw = new BufferedWriter(new FileWriter("text/to/numbers/wrong.in.txt")))
                {
                    for(String word : words)
                    {
                        bw.write(word + " ");
                    }
                }

            }
            return retval;
        }
    }
    
}
