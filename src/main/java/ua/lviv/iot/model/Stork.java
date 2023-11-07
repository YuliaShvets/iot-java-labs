package ua.lviv.iot.model;

public class Stork extends Bird {
    private String typeOfStorks;

    public Stork(String name, String colour, double weight, double speed, double feed, int lifeTime, boolean isBirdFlying, String typeOfStorks) {

        super(name, colour, weight, speed, feed, lifeTime, isBirdFlying);
        this.typeOfStorks = typeOfStorks;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", type of stork";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + typeOfStorks;
    }
}
