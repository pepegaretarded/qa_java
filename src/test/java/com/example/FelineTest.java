package com.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFamilyReturnsCatFamily() {
        assertEquals("Кошачьи", new Feline().getFamily());
    }

    @Test
    public void getKittensWithoutArgumentReturnsOne() {
        assertEquals(1, new Feline().getKittens());
    }

    @Test
    public void getKittensWithArgumentReturnsRequestedCount() {
        assertEquals(3, new Feline().getKittens(3));
    }

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), new Feline().eatMeat());
    }
}
