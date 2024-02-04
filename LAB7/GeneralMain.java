
import java.io.IOException;

import text.to.numbers.SingleLineFile;
import text.to.numbers.MultiLineFile;
import textfile.Statistics;



public class GeneralMain 
{
    public static void main(String[] args) throws IOException
    {
        if (args.length != 1)
        {
            System.out.println("ERROR HIHI");
        }
        String filename = args[0];

        //int result =  MultiLineFile.addNumbers(filename, " ");
        //int result = SingleLineFile.addNumbers(filename);
        int result1 = Statistics.numberOfCharacters(filename);
        int result2 = Statistics.numberOfLines(filename);

        System.out.println(result1 + " and " + result2);
    }
    
}
