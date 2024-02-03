package famous.sequence;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params .ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import famous.sequence.TriangularNumbers;

public class TriangularNumbersTest 
{
    @Test
    public void GTN1()
    {
        assertEquals(1,famous.sequence.TriangularNumbers.getTriangularNumber(1));
    }

    @ParameterizedTest
    @CsvSource({"1,1","2,3","3,6","4,10"})
    public void GTN2(int n, int expected)
    {
        assertEquals(expected,famous.sequence.TriangularNumbers.getTriangularNumber(n));
    }
    
}
