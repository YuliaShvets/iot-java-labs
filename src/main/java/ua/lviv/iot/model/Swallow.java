package ua.lviv.iot.model;

public class Swallow extends Bird {
    private String typeOfSwallow;

    public Swallow(String name, String colour, double weight, double speed, double feed, int lifeTime, boolean isBirdFlying, String typeOfSwallow) {

        super(name, colour, weight, speed, feed, lifeTime, isBirdFlying);
        this.typeOfSwallow = typeOfSwallow;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", type of swallow";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + typeOfSwallow;
    }
}

