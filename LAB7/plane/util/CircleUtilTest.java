package plane.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import plane.Circle;

public class CircleUtilTest 
{
    @Test
    public void init()
    {
        CircleUtil.writeCircle("util/circle.txt");
        CircleUtil.writeCircle("util/circle2.txt");
        assertEquals(1,2);
    }
    
}
