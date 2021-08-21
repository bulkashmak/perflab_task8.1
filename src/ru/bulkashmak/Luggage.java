package ru.bulkashmak;

public class Luggage implements Comparable<Luggage> {

    private int id;
    String carrier;
    String flightClass;
    int luggageWeight;
    int maxLuggageWeight = 22;

    public Luggage(String carrier, String flightClass, double luggageWeight) {
        this.carrier = carrier;
        this.flightClass = flightClass;
        this.id++;
        if (luggageWeight < maxLuggageWeight) {
            this.luggageWeight = (int) Math.round(luggageWeight);
        } else {
            System.err.printf("Luggage for luggage.id[%d] is too heavy\n", id);
        }
    }

    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Luggage o) {
        return (Integer.valueOf(this.luggageWeight)).compareTo(Integer.valueOf(o.luggageWeight));
    }

    @Override
    public String toString() {
        return "Luggage{" +
                "id=" + id +
                ", carrier='" + carrier + '\'' +
                ", flightClass='" + flightClass + '\'' +
                ", luggageWeight=" + luggageWeight +
                '}';
    }
}
