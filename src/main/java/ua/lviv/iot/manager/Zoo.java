package ua.lviv.iot.manager;

import ua.lviv.iot.model.Bird;
import ua.lviv.iot.model.Nightingale;
import ua.lviv.iot.model.Peafowl;
import ua.lviv.iot.model.Stork;
import ua.lviv.iot.model.Swallow;
import ua.lviv.iot.model.Swan;

import java.util.ArrayList;
import java.util.Comparator;

public class Zoo {
    ArrayList<Bird> birds = new ArrayList<Bird>();

    public void addBirds() {

        birds.add(new Swan("Cygnus atratus", "black", 7, 65.5, 3, 15, false, "Cygnus atratus"));
        birds.add(new Peafowl("Indian Peafowl", "Green", 5, 15, 5, 20, false, "Indian Peafowl"));
        birds.add(new Nightingale("Nightingale", "grey", 0.1, 60, 0.4, 5, true, "Nightingale"));
        birds.add(new Stork("Stork", "white", 3.1, 45, 3.5, 9, true, "Stork"));
        birds.add(new Swallow("Swallow", "black and white", 0.13, 55, 0.379, 4, true, "Swallow"));

    }

    ArrayList<Bird> found = new ArrayList<Bird>();

    public ArrayList<Bird> foundBirds() {

        for (Bird bird : birds) {
            if (bird.isBirdFlying()) {
                found.add(bird);
            }
        }
        for (int i = 0; i < found.size(); i++) {
            System.out.println(found.get(i));
        }
        return found;
    }

    public ArrayList<Bird> sortByWeightAsc() {

        found.sort(Comparator.comparing(Bird::getWeight));

        for (Bird count : found) {
            System.out.println(count);
        }
        return found;
    }

    public ArrayList<Bird> sortByWeightDesc() {

        found.sort(Comparator.comparing(Bird::getWeight).reversed());

        for (Bird count : found) {
            System.out.println(count);
        }
        return found;

    }

    public ArrayList<Bird> sortByFeedAsc() {

        found.sort(Comparator.comparing(Bird::getFeed));

        for (Bird count : found) {
            System.out.println(count);
        }
        return found;
    }

    public ArrayList<Bird> sortByFeedDesc() {

        found.sort(Comparator.comparing(Bird::getFeed).reversed());

        for (Bird count : found) {
            System.out.println(count);
        }
        return found;
    }
}
