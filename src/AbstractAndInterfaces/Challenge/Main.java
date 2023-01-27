package AbstractAndInterfaces.Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player ivan = new Player("Ivan", 100, 340);
        System.out.println(ivan.toString());
        savedObject(ivan);

        ivan.setHitPoints(50);
        System.out.println(ivan);
        ivan.setWeapon("AK47");
        System.out.println(ivan.toString());
        savedObject(ivan);


        Saveable wereWolf = new Monster("Werewolf", 20, 40);
        // wereWolf.getStrength();
        System.out.println("Strength = " + ((Monster) wereWolf).getStrength());
        System.out.println(wereWolf.toString());
        savedObject(wereWolf);


    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("""
            Choose :
            0 - To enter a String
            1 - To quit
            """
        );

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> {
                    System.out.println("Enter a String : ");
                    String in = scanner.nextLine();
                    values.add(index, in);
                    index++;
                }
                case 1 -> {
                    quit = true;
                }
            }
        }
        return values;
    }

    public static void savedObject(Saveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(Saveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}