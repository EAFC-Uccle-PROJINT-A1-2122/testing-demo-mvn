package be.eafcuccle.projint;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void addWithOneAndTwo() {
        Calc calc = new Calc();

        int result = calc.add(1, 2);

        assertEquals(3, result);
    }

    @Test
    public void multiplyWithOneAndTwo() {
        Calc calc = new Calc();

        int result = calc.multiply(1, 2);

        assertEquals(2, result);
    }

    @Test
    public void multiplyWithZero() {
        Calc calc = new Calc();

        int result = calc.multiply(1, 0);

        assertEquals(0, result);
    }
}
