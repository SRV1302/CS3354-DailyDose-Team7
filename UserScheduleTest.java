import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;


//these tests will ensure the schedule event function correctly checks for an existing event
public class UserScheduleTest {

    //this test returns false since there is no existing events
    @Test
    void testNoExistingEvent() {
        boolean result = UserSchedule.scheduleEvent(2025, 11, 28, 12, 30);
        assertFalse(result);
    }

    //this test run returns true that there is an existing event
    @Test
    void testWithExistingEvent() {
        boolean result = UserSchedule.scheduleEvent(2025, 12, 1, 10, 0);
        assertTrue(result);
    }

    //this test checks if the event was actually added to the arrayList after we add it in our function
    @Test
    void testEventAdditionValidity() {
        //create a new event
        LocalDateTime newEvent = LocalDateTime.of(2025, 12, 1, 10, 0);

        //add to the list and check if it
        UserSchedule.scheduleEvent(2025, 12, 1, 10, 0);

        //check the list to see if the event was added and return true if it was
        assertTrue(UserSchedule.getUserEvents().contains(newEvent));
    }
}
