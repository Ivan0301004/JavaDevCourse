package AbstractAndInterfaces.InnerClass;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button bprint = new Button("Print");

    public static void main(String[] args) {

/*        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        }

        bprint.setOnClickListener(new ClickListener());*/

        bprint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("You will get a good job with Java");
            }
        });

        listen();
    }


    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 -> {
                    quit = true;
                }
                case 1 -> {
                    bprint.onClick();
                }
            }
        }
    }
}
