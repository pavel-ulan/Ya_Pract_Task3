package ru.yandex.prakticum.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import ru.yandex.prakticum.model.impl.AlexLion;
import ru.yandex.prakticum.model.impl.Feline;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


@RunWith(MockitoJUnitRunner.class)
public class AlexTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() {
        AlexLion alex = new AlexLion(feline);
        int actualResult = alex.getKittens();
        assertEquals("Некорректный результат вызова метода", 0, actualResult);
    }

    @Test
    public void getFriendsTest() {
        AlexLion alex = new AlexLion(feline);
        List<String> expectedResult = List.of("Глория", "Мелман", "Марти");
        List<String> actualResult = alex.getFriends();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void getPlaceOfLivingTest() {
        AlexLion alex = new AlexLion(feline);
        String expectedResult = "Зоопарк Нью-Йорка";
        String actualResult = alex.getPlaceOfLiving();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void alexManeTest() {
        AlexLion alex = new AlexLion(feline);
        boolean actualResult = alex.doesHaveMane();
        assertTrue("Некорректое значение свойства", actualResult);
    }
}
