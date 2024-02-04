package text.to.numbers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiLineFile 
{
    public static int addNumbers(String filename, String c) throws IOException
    {
        try (BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            List<String> words = new ArrayList<>();
            int retval = 0;
            String line;
            while((line = br.readLine()) != null) 
            {
                if(!line.trim().isEmpty())
                {
                    String[] parts = line.split(c);
                    for (String part : parts)
                    {
                        try{
                            retval += Integer.parseInt(part);

                        } catch(NumberFormatException e)
                        {
                            System.err.println("Invalid: " + e);
                            words.add(part);
                        }
                    }
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
