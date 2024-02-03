package array.util;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

import array.util.ArrayUtil;

public class ArrayUtilStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("array.util.ArrayUtil")
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    public void methodMax() {
        it.hasMethodWithParams("max", "array of int")
            .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
            .thatReturns("int");
    }

    @Test
    public void methodMax2() {
        it.hasMethodWithParams("max2", "array of int")
            .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
            .thatReturns("int");
    }

    @Test
    public void methodMax3() {
        it.hasMethodWithParams("max3", "array of int")
            .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
            .thatReturns("int");
    }

    @Test
    public void methodMax4() {
        it.hasMethodWithParams("max4", "array of int")
            .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
            .thatReturns("int");
    }

    @Test
    public void methodMinMax() {
        it.hasMethodWithParams("minMax", "array of int")
            .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
            .thatReturns("array of int");
    }
}

