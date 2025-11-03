import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(8, -2, 9, -5));

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    

    // TODO: Make tests for each problem you solve
    @Test
    void testLongestWordWithSpecificLetter() {
        
        String[] string = {"Orion", "Oscillate", "ozempic", "o", "ostrich"}; // Oscillate

        String actual = Practice.longestWordWithSpecificLetter(string, 'o');

        assertEquals("Oscillate", actual);


    }

    @Test
    void testWordCountWithLongAndShort() {
        String[] string = {"Orion", "Skyler", "Brendan", "jennifer", "sebastian", "g", "league of legends"}; //2

        int actual = Practice.wordCountWithLongAndShort(0, 6, string);

        assertEquals(2, actual);

    }
}


