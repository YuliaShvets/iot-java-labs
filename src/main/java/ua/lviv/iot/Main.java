package ua.lviv.iot;

import ua.lviv.iot.manager.Zoo;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addBirds();
        System.out.println("Found birds in a zoo");
        zoo.foundBirds();
        System.out.println("\n");
        System.out.println("Sort found birds' weight by ascending");
        zoo.sortByWeightAsc();
        System.out.println("\n");
        System.out.println("Sort found birds' weight by descending");
        zoo.sortByWeightDesc();
        System.out.println("\n");
        System.out.println("Sort birds' food by ascending");
        zoo.sortByFeedAsc();
        System.out.println("\n");
        System.out.println("Sort birds' food by descending");
        zoo.sortByFeedDesc();

    }
}
