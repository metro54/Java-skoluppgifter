package ovning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameAgeLookUpTest {

    @Test
    void testGetAgeForAnna() {
        NameAgeLookUp lookup = new NameAgeLookUp();
        int expected = 25;
        int actual = lookup.getAge("Anna");

        assertEquals(expected,actual);
    }
}
