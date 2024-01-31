package restaurant.structure;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import check.CheckThat;

public class BurgerChainStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("restaurant.place.BurgerChain", withParent("restaurant.place.BurgerPlace"))
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .thatHas(EQUALITY_CHECK);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldName() {
        it.hasField("name: String")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldPastOrders() {
        it.hasField("pastOrders: List of restaurant.order.Order")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void constructor() {
        it.hasConstructor(withArgs("name: String"))
            .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodSaveData() {
        it.hasMethod("saveData", withNoParams())
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .thatReturnsNothing();
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodTakeOrder() {
        it.hasMethod("takeOrder", withParams("int"))
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .thatReturns("restaurant.order.Order");
    }
}

