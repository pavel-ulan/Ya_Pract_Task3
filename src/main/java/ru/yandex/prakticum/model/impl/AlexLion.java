package ru.yandex.prakticum.model.impl;

import java.util.List;

public class AlexLion extends Lion {

    public AlexLion(Feline feline) {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of("Глория", "Мелман", "Марти");
    }

    public String getPlaceOfLiving() {
        return "Зоопарк Нью-Йорка";
    }
}
