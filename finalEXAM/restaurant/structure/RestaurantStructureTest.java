package restaurant.structure;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import check.CheckThat;

public class RestaurantStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theInterface("restaurant.place.Restaurant")
            .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodIsDone() {
        it.hasMethod("isDone", withParams("orderNumber: int"))
            .thatIs(NOT_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .thatReturns("boolean");
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodOrder() {
        it.hasMethod("order", withParams("type: restaurant.order.OrderType", "item: String", "isMenu: boolean"))
            .thatIs(NOT_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .thatReturns("int");
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodTakeOrder() {
        it.hasMethod("takeOrder", withParams("orderNumber: int"))
            .thatIs(NOT_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .thatReturns("restaurant.order.Order");
    }
}

