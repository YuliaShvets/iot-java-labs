package ua.lviv.iot.model;

public class Peafowl extends Bird {
    private String typeOfPeafowl;

    public Peafowl(String name, String colour, double weight, double speed, double feed, int lifeTime, boolean isBirdFlying, String typeOfPeafowl) {

        super(name, colour, weight, speed, feed, lifeTime, isBirdFlying);
        this.typeOfPeafowl = typeOfPeafowl;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", type of peafowl";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + typeOfPeafowl;
    }
}

