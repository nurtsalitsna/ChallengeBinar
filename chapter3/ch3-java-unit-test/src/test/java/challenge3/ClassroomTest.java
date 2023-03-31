package challenge3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@DisplayName("Test Classroom")
public class ClassroomTest {
    private List<String> studentsGrade;
    private String name;
    private static String GRADE_FILE_PATH = "C:\\Users\\Lisna Ima\\Documents\\MSIB-Binar\\chapter3\\ch3-java-unit-test\\res\\data_sekolah.csv";
    Classroom classroom = new Classroom("name", studentsGrade);

    @Test
    public void testgetMeanSucces() throws FileNotFoundException {
        var result = classroom.getMean();
        assertEquals(8, result);
    }
}
