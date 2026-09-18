package com.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CatTest {

    @Test
    public void getSoundReturnsMeow() {
        assertEquals("Мяу", new Cat(mock(Feline.class)).getSound());
    }

    @Test
    public void getFoodDelegatesToPredator() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));

        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), new Cat(feline).getFood());
    }
}
