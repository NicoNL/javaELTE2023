package restaurant.structure;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import check.CheckThat;

public class OrderStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("restaurant.order.Order")
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldType() {
        it.hasField("type: OrderType")
            .thatIs(INSTANCE_LEVEL, NOT_MODIFIABLE, VISIBLE_TO_ALL)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldItem() {
        it.hasField("item: String")
            .thatIs(INSTANCE_LEVEL, NOT_MODIFIABLE, VISIBLE_TO_ALL)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldMeal() {
        it.hasField("isInMenu: boolean")
            .thatIs(INSTANCE_LEVEL, NOT_MODIFIABLE, VISIBLE_TO_ALL)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldPrice() {
        it.hasField("price: int")
            .thatIs(INSTANCE_LEVEL, NOT_MODIFIABLE, VISIBLE_TO_NONE)
            .thatHas(GETTER)
            .thatHasNo(SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldOrderNumber() {
        it.hasField("orderNumber: int")
            .thatIs(INSTANCE_LEVEL, NOT_MODIFIABLE, VISIBLE_TO_ALL)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldNextOrderNumber() {
        it.hasField("nextOrderNumber: int")
            .thatIs(USABLE_WITHOUT_INSTANCE, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(GETTER, SETTER);
    }

    @Test
    @DisabledIf(notApplicable)
    public void fieldDone() {
        it.hasField("isDone: boolean")
            .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
            .thatHasNo(SETTER);
    }

    // "getter"
    @Test
    @DisabledIf(notApplicable)
    public void methodIsDone() {
        it.hasMethod("isDone", withNoParams())
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .thatReturns("boolean");
    }

    @Test
    @DisabledIf(notApplicable)
    public void constructor() {
        it.hasConstructor(withArgs("type: OrderType", "item: String", "isInMenu: boolean"))
            .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    @DisabledIf(notApplicable)
    public void methodMake() {
        it.hasMethod("make", withNoParams())
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .thatReturnsNothing();
    }
}

