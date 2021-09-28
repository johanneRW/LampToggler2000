package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LampToggler3000 {

    // TODO: Make list of lamps
    Lampe skrivebord = new Lampe("skrivebord");
    Lampe loft = new Lampe("loft");
    Lampe seng = new Lampe("seng");
    Lampe køkken = new Lampe("køkken");
    Lampe stue = new Lampe("stue");

    // TODO: Initialize list of lamps
    Lampe[] lampNames = {skrivebord, loft, seng, køkken, stue};
    ArrayList<Lampe> lampList = new ArrayList<>(List.of(lampNames));

    public static void main(String[] args) {
        LampToggler3000 application = new LampToggler3000();
        application.start();
    }

    public void start() {
        System.out.println("Welcome to LampToggler3000");
        System.out.println("The lamp toggle application to end all your lamp toggle application needs!");


        printHelp();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            String input = scanner.nextLine();
            String command = input.substring(0, 1);
            String lampname = "";
            if (input.contains(" ")) {
                lampname = input.substring(input.indexOf(" ") + 1);
            }
            switch (command) {
                case "q":
                    running = false;
                    break;
                case "l":
                    listLamps();
                    break;
                case "a":
                    addLamp(lampname);
                    break;
                case "r":
                    removeLamp(lampname);
                    break;
                case "t":
                    toggleLamp(lampname);
                    break;
                case "?":
                    getLampStatus(lampname);
                    break;
                default:
                    System.out.println("Unknown command: " + command);
                    printHelp();
            }
        }
    }

    public void printHelp() {
        System.out.println("Commands available are:");
        System.out.println("""
                a 'lampname' \t - add a new lamp to the application
                r 'lampname' \t - remove an existing lamp
                t 'lampname' \t - toggle an existing lamp (turn on or off)
                ? 'lampname' \t - ask about the status for an existing lamp
                l \t - list all lamps with their names and status
                q \t - quits the application (but why would you??)
                """);
    }

    public void listLamps() {
        System.out.println("These lamps are currently in the system: ");
        // TODO: List lamps and their status

        System.out.println(lampList);
    }


    public void addLamp(String lampName) {
        // TODO: create new lamp with the name lampName
        Lampe lampe = new Lampe(lampName);
        // TODO: add the new lamp to the list of lamps
        lampList.add(lampe);
    }

    public void removeLamp(String lampName) {
        // TODO: Find the lamp with the given name in the list of lamps
        // TODO: Remove that lamp from the list of lamps (if it exists)
        // TODO: Output error-message if lamp doesn't exist
        boolean found = false;
        for (int i = 0; i < lampList.size(); i++) {
            Lampe lampe = lampList.get(i);
            if (lampe.getLampeNavn().equals(lampName)) {
                lampList.remove(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println(lampName + " do not exists");
        }
    }

    public void toggleLamp(String lampName) {
        // TODO: Find the lamp with the given name in the list of lamps
        // TODO: Toggle the status of that lamp
        // TODO: Output error-message if lamp doesn't exis
        boolean found = false;
        for (int i = 0; i < lampList.size(); i++) {
            Lampe lampe = lampList.get(i);
            if (lampe.getLampeNavn().equals(lampName)) {
                lampe.trykPåKontakt();
                found = true;
            }
        }
        if (!found) {
            System.out.println(lampName + " do not exists");
        }
    }
    public void getLampStatus(String lampName) {
        // TODO: Find the lamp with the given name in the list of lamps
        // TODO: Get the status of that lamp, and print it
        // TODO: Output error-message if lamp doesn't exist
        boolean found = false;
        for (int i = 0; i < lampList.size(); i++) {
            Lampe lampe = lampList.get(i);
            if (lampe.getLampeNavn().equals(lampName)) {
                System.out.println(lampe);
                found = true;
            }
        }
        if (!found) {
            System.out.println(lampName + " do not exists");


        }

    }
}

