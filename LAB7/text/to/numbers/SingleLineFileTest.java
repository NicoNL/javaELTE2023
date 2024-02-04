package text.to.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


import java.io.IOException;

import org.junit.jupiter.api.Test;

import text.to.numbers.SingleLineFile;

public class SingleLineFileTest 
{
    @Test
    public void file() throws IOException{
        assertEquals(6,text.to.numbers.SingleLineFile.addNumbers("text/to/numbers/number.txt"));
    }

    @Test
    public void emptyFile() throws IOException{
        try{
            SingleLineFile.addNumbers("text/to/numbers/Empty.txt");
        }
        catch(IllegalArgumentException e){
            assertEquals("Empty file", e.getMessage());
        }
    }

    @Test 
    public void notExistFile() throws IOException {
        try {
            SingleLineFile.addNumbers("not_there.txt");
        } catch (IOException e) {
        //I expect this to happen
        }
    }

    @Test 
    public void cantConvertNumber() throws IOException {
        try {
            SingleLineFile.addNumbers("text/to/numbers/Fail.txt");
        } catch (IOException e) 
        {
            fail("Me pica el orto" + e.getMessage());
        }
    }

    
}
