package seedu.address.testutil;

import seedu.address.commons.core.index.Index;
import seedu.address.model.person.Attendance;

/**
 * A utility class containing a list of {@code Attendance} and {@code Index} objects to be used in tests.
 */
public class TypicalAttendance {
    public static final Index INDEX_FIRST_TUTORIAL = Index.fromOneBased(1);
    public static final Index INDEX_SECOND_TUTORIAL = Index.fromOneBased(2);
    public static final Index INDEX_INVALID_TUTORIAL = Index.fromZeroBased(Attendance.NUMBER_OF_TUTORIALS);

    public static final Attendance ATTENDANCE_A =
            new Attendance("true false ".repeat(Attendance.NUMBER_OF_TUTORIALS / 2)
                    + "false".repeat(Attendance.NUMBER_OF_TUTORIALS % 2));
    public static final Attendance ATTENDANCE_B =
            new Attendance("true false ".repeat(Attendance.NUMBER_OF_TUTORIALS / 2)
                    + "true".repeat(Attendance.NUMBER_OF_TUTORIALS % 2));

    public static final Attendance ATTENDANCE_ALL_FALSE =
            new Attendance("false ".repeat(Attendance.NUMBER_OF_TUTORIALS));
    public static final Attendance ATTENDANCE_ALL_TRUE =
            new Attendance("true ".repeat(Attendance.NUMBER_OF_TUTORIALS));

    public static final String ATTENDANCE_STRING_NOT_BOOLEANS =
            "1 ".repeat(Attendance.NUMBER_OF_TUTORIALS);
    public static final String ATTENDANCE_STRING_NOT_ENOUGH_TUTORIALS =
            "true ".repeat(Attendance.NUMBER_OF_TUTORIALS - 1);
}
