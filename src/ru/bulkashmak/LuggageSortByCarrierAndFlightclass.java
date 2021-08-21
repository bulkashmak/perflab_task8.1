package ru.bulkashmak;

import java.util.Comparator;

public class LuggageSortByCarrierAndFlightclass implements Comparator<Luggage> {

    @Override
    public int compare(Luggage o1, Luggage o2) {

        int o1Length = o1.carrier.length() + o1.flightClass.length();
        int o2Length = o2.carrier.length() + o2.flightClass.length();

        return Integer.compare(o1Length, o2Length);
    }
}
