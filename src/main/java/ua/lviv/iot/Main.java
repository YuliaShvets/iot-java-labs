package ua.lviv.iot;

import ua.lviv.iot.manager.RegExpression;

public class Main {

    public static void main(String[] args) {

        RegExpression regex = new RegExpression();
        regex.replaceGrade("Ivanenko Ivan 67");
        regex.replaceGrade("Petrenko Petro 23");
        regex.replaceGrade("Vasylenko Vasyl 45");
        regex.replaceGrade("Melnyk Andriy 75");
        regex.replaceGrade("Kravchuk Serhii 99");





    }
}
