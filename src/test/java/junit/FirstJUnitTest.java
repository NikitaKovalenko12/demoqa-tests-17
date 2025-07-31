package junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class FirstJUnitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    void  beforeEach() {
        System.out.println("    Before each test");
    }

    @AfterEach
    void  afterEach() {
        System.out.println("    After each test");
    }

    @Test
    void firstTest() {
        System.out.println("        It's 1 test");
        assertEquals(1, 1);
    }

    @Test
    void secondTest() {
        System.out.println("        It's 2 test");
        assertEquals(1, 1);
    }
}
