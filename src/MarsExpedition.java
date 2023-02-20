import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the expedition....");
        System.out.println("Getting ready....");
        System.out.println("...");
        System.out.println("Ready");

        System.out.println("Hello, what is your name?");

        String name = scan.nextLine();

        System.out.println("Hi, " + name + "-Welcome to the Expedition prep program.  Are you ready to head out into the new world?  Type Y or N");

        String excited = scan.nextLine();

        if (excited.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that.  YOu are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader.  You have to go");
        }

        System.out.println("How many people do you want on your team?");

        int teamSize = scan.nextInt();

        if (teamSize > 2) {
            System.out.println("That's way too many people.  We can only send 2 more members.");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough members.  We need you and 2 more members");
            teamSize = 2;
        } else if (teamSize == 2) {
            System.out.println("That's a perfectly sized team.  Good luck.");
        }

        System.out.println("You are allowed to bring one snack with you.  What do you want to bring?");
        String snack = scan.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you");

        System.out.println("You have a choice of one of these 3 vehicles"+
                "\n 1: A Mars Rover" +
                "\n 2: A Spaceship" +
                "\n 3: A Flying Saucer");
        String vehicleChoice = scan.nextLine();

        if (vehicleChoice.equalsIgnoreCase("1")) {
            vehicleChoice = "A Mars Rover";
        } else if (vehicleChoice.equalsIgnoreCase("2")) {
            vehicleChoice = "A Spaceship";
        } else if (vehicleChoice.equalsIgnoreCase("3")) {
            vehicleChoice = "A Flying Saucer";
        } else {
            vehicleChoice = "your feet";
        }

        System.out.println("Your team is now ready" +
                "\nLed by " + name + " with " + teamSize + " members." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nYour team heads out in" +
                "\n5" +
                "\n4" +
                "\n3" +
                "\n2" +
                "\n1" +
                "\nBlast Off!");
    }
}
