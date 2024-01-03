package restaurant.structure;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import check.CheckThat;

public class BurgerPlaceStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("restaurant.place.BurgerPlace", withInterface("restaurant.place.Restaurant"))
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldOrders() {
        it.hasField("orders: Map of Integer to restaurant.order.Order")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldProfit() {
        it.hasField("profit: int")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHas(GETTER)
            .thatHasNo(SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void constructor() {
        it.hasConstructor(withNoArgs())
            .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodIsDone() {
        it.hasMethod("isDone", withParams("orderNumber: int"))
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .thatReturns("boolean");
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodMakeNextOrder() {
        it.hasMethod("makeNextOrder", withNoParams())
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .thatReturns("boolean");
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodOrder() {
        it.hasMethod("order", withParams("type: restaurant.order.OrderType", "String", "boolean"))
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .thatReturns("int");
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodTakeOrder() {
        it.hasMethod("takeOrder", withParams("int"))
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .thatReturns("restaurant.order.Order");
    }
}

