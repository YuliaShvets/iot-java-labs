package ua.lviv.iot.model;

public class Swan extends Bird {
    private String typeOfSwan;

    public Swan(String name, String colour, double weight, double speed, double feed, int lifeTime, boolean isBirdFlying, String typeOfSwan) {

        super(name, colour, weight, speed, feed, lifeTime, isBirdFlying);
        this.typeOfSwan = typeOfSwan;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", type of swan";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + typeOfSwan;
    }
}

