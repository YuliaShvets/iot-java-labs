package ua.lviv.iot.model;

public class Swan extends Bird {
    private String typeOfSwans;

    public Swan(String name, String colour, double weight, double speed, double feed, int lifeTime, boolean isBirdFlying, String typeOfSwans) {

        super(name, colour, weight, speed, feed, lifeTime, isBirdFlying);
        this.typeOfSwans = typeOfSwans;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", type of swan";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + typeOfSwans;
    }
}
