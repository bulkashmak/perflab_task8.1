package ru.bulkashmak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Luggage> luggageList = new ArrayList<>();
        luggageList.add(new Luggage("Аэрофлот", "Экономный", 12));
        luggageList.add(new Luggage("Аэрофлот", "Экономный", 13));
        luggageList.add(new Luggage("Аэрофлот", "Бизнес", 8));
        luggageList.add(new Luggage("Аэрофлот", "Бизнес", 21));
        luggageList.add(new Luggage("Аэрофлот", "Первый класс", 5));
        luggageList.add(new Luggage("Аэрофлот", "Первый класс", 19));

        Collections.sort(luggageList);
        for (Luggage luggage : luggageList) {
            System.out.println(luggage);
        }

        System.out.println("---------");

        LuggageSortByCarrierAndFlightclass customSort = new LuggageSortByCarrierAndFlightclass();
        luggageList.sort(customSort);
        for (Luggage luggage : luggageList) {
            System.out.println(luggage);
        }
    }
}
