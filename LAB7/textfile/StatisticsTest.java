package textfile;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


import java.io.IOException;

import org.junit.jupiter.api.Test;

import textfile.Statistics;

public class StatisticsTest 
{
    @Test
    public void file() throws IOException{
        assertEquals(3, textfile.Statistics.numberOfLines("textfile/sample.txt"));
        assertEquals(12, textfile.Statistics.numberOfCharacters("textfile/sample.txt"));

    }

    @Test
    public void emptyFile()throws IOException{
        assertEquals(0, textfile.Statistics.numberOfLines("textfile/empty.txt"));
        assertEquals(0, textfile.Statistics.numberOfCharacters("textfile/empty.txt"));

    }

    @Test
    public void notExistingFile() throws IOException{
        try{
            Statistics.numberOfCharacters("notfile.txt");
            Statistics.numberOfLines("notfile.txt");
        } catch(IOException e){

        }
    }
    
}
