
//This class will include user schedule data and CRUD operations.
//For now, the method scheduleEvent checks for scheduling conflicts when a new event is added by the user. This is the method that is tested in our test plan.

import java.time.LocalDateTime;

public class UserSchedule {

    private static LocalDateTime[] userEvents = {LocalDateTime.of(2025, 12, 8, 15, 0),
            LocalDateTime.of(2025, 11, 28, 12, 30),
            LocalDateTime.of(2025, 11, 27, 9, 45),
            LocalDateTime.of(2025, 11, 26, 16, 0) };

    public static boolean scheduleEvent(int year, int month, int dayOfMonth, int hour, int minute) {
        LocalDateTime newEvent = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
        for (LocalDateTime existingEvent : userEvents) {
            if (existingEvent.equals(newEvent)) {
                return false;
            }
        }
        return true;
    }



}
