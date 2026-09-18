package com.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionTest {

    @Test
    public void maleLionHasMane() throws Exception {
        assertTrue(new Lion("Самец", mock(Feline.class)).doesHaveMane());
    }

    @Test
    public void femaleLionDoesNotHaveMane() throws Exception {
        assertFalse(new Lion("Самка", mock(Feline.class)).doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void invalidSexThrowsException() throws Exception {
        new Lion("Неизвестно", mock(Feline.class));
    }

    @Test
    public void getKittensUsesInjectedFeline() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getKittens()).thenReturn(2);

        assertEquals(2, new Lion("Самец", feline).getKittens());
    }

    @Test
    public void getFoodUsesInjectedFeline() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));

        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), new Lion("Самец", feline).getFood());
    }
}
