import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class FirstJUnitTests {
    @Disabled
    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void mySecondTest() {
        assertEquals("Word", "Word");
    }
}
