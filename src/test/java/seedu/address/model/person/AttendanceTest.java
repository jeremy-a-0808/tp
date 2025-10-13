package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static seedu.address.testutil.TypicalAttendance.ATTENDANCE_A;
import static seedu.address.testutil.TypicalAttendance.ATTENDANCE_B;
import static seedu.address.testutil.TypicalAttendance.ATTENDANCE_STRING_NOT_BOOLEANS;
import static seedu.address.testutil.TypicalAttendance.ATTENDANCE_STRING_NOT_ENOUGH_TUTORIALS;

import org.junit.jupiter.api.Test;

import seedu.address.commons.core.index.Index;

public class AttendanceTest {

    @Test
    public void addAttendance_success() {
        Attendance addedAttendance = ATTENDANCE_A.addAttendance(Index.fromOneBased(Attendance.NUMBER_OF_TUTORIALS));
        assertEquals(ATTENDANCE_B, addedAttendance);
    }

    @Test
    public void removeAttendance_success() {
        Attendance removedAttendance =
                ATTENDANCE_B.removeAttendance(Index.fromOneBased(Attendance.NUMBER_OF_TUTORIALS));
        assertEquals(ATTENDANCE_A, removedAttendance);
    }

    @Test
    public void isInvalidAttendance() {
        assertFalse(Attendance.isValidAttendance(ATTENDANCE_STRING_NOT_BOOLEANS));
        assertFalse(Attendance.isValidAttendance(ATTENDANCE_STRING_NOT_ENOUGH_TUTORIALS));
    }
}
