package restaurant.structure;

import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.Test;
import check.CheckThat;

public class OrderTypeStructureTest {
    @Test
    public void testEnum() {
        CheckThat.theEnum("restaurant.order.OrderType")
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .hasEnumElements("DINE_IN", "TAKEAWAY", "DELIVERY");
    }
}

