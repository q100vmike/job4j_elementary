package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Миша";
        names[1] = "Гриша";
        names[2] = "Света";
        names[3] = "Галя";

        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println("names[0] равен: " + names[0]);
        System.out.println("names[1] равен: " + names[1]);
        System.out.println("names[2] равен: " + names[2]);
        System.out.println("names[3] равен: " + names[3]);
    }
}
