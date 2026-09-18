package com.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class AlexTest {

    @Test
    public void constructorCreatesMaleLion() throws Exception {
        assertTrue(new Alex(mock(Feline.class)).doesHaveMane());
    }

    @Test
    public void getFriendsReturnsAlexFriends() throws Exception {
        assertEquals(Arrays.asList("Марти", "Глория", "Мелман"), new Alex(mock(Feline.class)).getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnsNewYorkZoo() throws Exception {
        assertEquals("Нью-Йоркский зоопарк", new Alex(mock(Feline.class)).getPlaceOfLiving());
    }

    @Test
    public void getKittensReturnsZero() throws Exception {
        assertEquals(0, new Alex(mock(Feline.class)).getKittens());
    }
}
