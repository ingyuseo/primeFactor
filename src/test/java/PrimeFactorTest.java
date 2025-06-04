import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {
    @Test
    public void testPrimefactorOf1() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }


}