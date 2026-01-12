import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    @Test
    public void testCountExcellentStudents() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        // Case 1: Mixed valid and invalid scores
        // Valid: 9.0 (Exc), 8.5 (Exc), 7.0 (Not Exc)
        // Invalid: 11.0, -1.0
        // Expected Excellent: 9.0, 8.5 -> Count: 2
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), "Should count only valid excellent students");

        // Case 2: All valid, all excellent
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(8.0, 10.0)), "Should count boundary excellent scores");

        // Case 3: Empty list
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()), "Empty list should return 0");

        // Case 4: Null list
        assertEquals(0, analyzer.countExcellentStudents(null), "Null list should return 0");

        // Case 5: Boundary & Invalid
        // 0.0 (Valid, Not Exc), 7.99 (Valid, Not Exc), 8.0 (Valid, Exc)
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(0.0, 7.99, 8.0)));
    }

    @Test
    public void testCalculateValidAverage() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        // Case 1: Mixed valid and invalid
        // Valid: 9.0, 8.5, 7.0 -> sum = 24.5, count = 3 -> avg = 8.166...
        // Invalid: 11.0, -1.0
        assertEquals(8.167, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01, "Should calculate average of valid scores only");

        // Case 2: All valid
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)), 0.01, "Average of 0 and 10 is 5");

        // Case 3: Empty list
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.01, "Empty list returns 0.0");

        // Case 4: Only invalid scores
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-10.0, 20.0)), 0.01, "No valid scores returns 0.0");
    }
}
