package ua.lviv.iot.model;

public class Bird {
    private String name;
    private String colour;
    private double weight; // kg
    private double speed;  // km/h
    private double feed;         // kg/day
    private int lifeTime;// years
    private boolean isBirdFlying;


    public boolean isBirdFlying() {
        return isBirdFlying;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getFeed() {
        return feed;
    }

    public Bird(String name, String colour, double weight, double speed, double feed, int lifeTime, boolean isBirdFlying) {
        this.name = name;
        this.colour = colour;
        this.weight = weight;
        this.speed = speed;
        this.feed = feed;
        this.lifeTime = lifeTime;
        this.isBirdFlying = isBirdFlying;
    }

    public Bird() {
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", feed=" + feed +
                ", lifeTime=" + lifeTime +
                ", isBirdFlying=" + isBirdFlying +
                '}';
    }
}
