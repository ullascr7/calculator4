
package com.example.vvce.calculator4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAddition() {

        App obj = new App();

        assertEquals(15, obj.add(10, 5));
    }

    @Test
    void testSubtraction() {

        App obj = new App();

        assertEquals(5, obj.subtract(10, 5));
    }
}
