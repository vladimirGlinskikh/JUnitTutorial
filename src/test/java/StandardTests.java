import org.junit.jupiter.api.*;

class StandardTests {
    @BeforeAll
    static void initAll() {

    }

    @BeforeEach
    void init() {
    }

    @Test
    @Disabled("for demonstration purpose")
    void skippedTest() {
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }
}
