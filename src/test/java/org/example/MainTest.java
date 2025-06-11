package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @Test
    public void testPositiveCaseCalculateYears() {
        int yearsLeft = Main.calculateYears(50);
        assertEquals(50,yearsLeft);
    }

    @Test
    public void testEdgeCaseCalculateYears() {
        int yearsLeft = Main.calculateYears(100);
        assertEquals(0,yearsLeft);
        yearsLeft = Main.calculateYears(0);
        assertEquals(100,yearsLeft);
    }
}
