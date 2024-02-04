package textfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Statistics 
{
    public static int numberOfCharacters(String filename) throws IOException
    {
        try(BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            int cnt = 0;
            String line;
            while((line = br.readLine()) != null)
            {
                if(!line.trim().isEmpty())
                {
                    String[] parts = line.split(" ");
                    for(String part : parts)
                    {
                        cnt += part.length();
                    }
                }
            }
            return cnt;
        }
    }
    public static int numberOfLines(String filename) throws IOException
    {
        try(BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            int cnt = 0;
            String line;
            while((line = br.readLine()) != null)
            {
                cnt++;
            }
            return cnt;
        }
    }
}
