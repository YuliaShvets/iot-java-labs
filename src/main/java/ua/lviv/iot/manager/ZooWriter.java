package ua.lviv.iot.manager;

import ua.lviv.iot.model.Bird;
import ua.lviv.iot.model.Nightingale;
import ua.lviv.iot.model.Peafowl;
import ua.lviv.iot.model.Stork;
import ua.lviv.iot.model.Swallow;
import ua.lviv.iot.model.Swan;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ZooWriter {
    public static void writeCSV() throws IOException {
        try (FileWriter writer = new FileWriter("result.csv")) {
            String previousClassName = "";
            ArrayList<Bird> birds = new ArrayList<>();
            birds.add(new Swan("Swan", "black", 7, 65.5, 3, 15, false, "Cygnus atratus"));
            birds.add(new Peafowl("Peafowl", "Green", 5, 15, 5, 20, false, "Indian Peafowl"));
            birds.add(new Nightingale("Nightingale", "grey", 0.1, 60, 0.4, 5, true, "Nightingale grey"));
            birds.add(new Stork("Stork", "white", 3.1, 45, 3.5, 9, true, "Stork white"));
            birds.add(new Swallow("Swallow", "black and white", 0.13, 55, 0.379, 4, true, "Swallow black"));
            for (var bird : birds) {
                if (!bird.getClass().getSimpleName().equals(previousClassName)) {
                    writer.write(bird.getHeaders());
                    writer.write("\r\n");
                    previousClassName = bird.getClass().getSimpleName();
                }

                writer.write(bird.toCSV());
                writer.write("\r\n");


            }
        }
    }
}
