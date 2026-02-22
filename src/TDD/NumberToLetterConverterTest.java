package TDD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberToLetterConverterTest {

    @Test
    void testConvert1ToA() {
        NumberToLetterConverter converter = new NumberToLetterConverter();

        String expected = "Z";
        String actual = converter.convert(26);
        assertEquals(expected, actual);

    }
}
