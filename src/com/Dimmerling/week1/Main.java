package com.Dimmerling.week1;
import java.util.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    static HashMap <String,Double> hmpa = new HashMap<>();
    static ArrayList<String> cities = new ArrayList<>();
    public static void main(String[] args) {

        promptInput();
        System.out.println(hmpa);
    }

    public static void promptInput(){
        System.out.println("Give me a city name Type end when you have entered all your city names");
        String userInput = input.nextLine();
        while (!userInput.equalsIgnoreCase("END")) {
            hmpa.put(userInput, calculateAvg());
            System.out.println("Give me a city name Type END when you have entered all your city names");
            userInput = input.nextLine();
        }
    }

    public static double calculateAvg(){
        double dailyTemp = 0;
        for ( int i = 0; i <5; i++) {
            System.out.println("What is the daily temp for the next day");
            dailyTemp += Double.parseDouble(input.nextLine());
        }
        dailyTemp/=5;
        return dailyTemp;
    }
}