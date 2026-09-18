package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int kittensCount;

    public FelineParameterizedTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[] data() {
        return new Object[]{0, 1, 3, 10};
    }

    @Test
    public void getKittensReturnsParameterizedCount() {
        assertEquals(kittensCount, new Feline().getKittens(kittensCount));
    }
}
