package text.to.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import text.to.numbers.MultiLineFile;

public class MultiLineFileTest 
{
       @Test
    public void file() throws IOException{
        assertEquals(36,text.to.numbers.MultiLineFile.addNumbers("text/to/numbers/number.txt", " "));
    }

    @Test
    public void emptyFile() throws IOException{
        try{
            MultiLineFile.addNumbers("text/to/numbers/Empty.txt", " ");
        }
        catch(IllegalArgumentException e){
            assertEquals("Empty file", e.getMessage());
        }
    }

    @Test 
    public void notExistFile() throws IOException {
        try {
            MultiLineFile.addNumbers("not_there.txt", " ");
        } catch (IOException e) {
        //I expect this to happen
        }
    }
    
}
