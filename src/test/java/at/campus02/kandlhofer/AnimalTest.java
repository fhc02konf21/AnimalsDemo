package at.campus02.kandlhofer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    int a;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        a = 1;
    }

    @Test
    void myFirstTest() {
        assertTrue(a > 0);
    }
}
