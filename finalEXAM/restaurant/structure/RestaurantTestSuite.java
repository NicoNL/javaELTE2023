package restaurant.structure;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import restaurant.test.BurgerChainTest;
import restaurant.test.BurgerPlaceTest;
import restaurant.test.OrderTest;

@SelectClasses({
      RestaurantTestSuite.StructuralTests.class
    , RestaurantTestSuite.FunctionalTests.class
})
@Suite public class RestaurantTestSuite {
    @SelectClasses({
          OrderTypeStructureTest.class
        , OrderStructureTest.class
        , RestaurantStructureTest.class
        , BurgerPlaceStructureTest.class
        , BurgerChainStructureTest.class
    })
    @Suite public static class StructuralTests {}

    @SelectClasses({
          OrderTest.class
        , BurgerPlaceTest.class
        , BurgerChainTest.class
    })
    @Suite public static class FunctionalTests {}
}

