import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome Back!  Please list everything you found!");
        ArrayList<String>rocks = new ArrayList<String>();

        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");
        System.out.println(rocks);

        System.out.println("The last item is not a rock.  Please delete it!");
        rocks.remove("not rock");

        System.out.println(rocks);

        Thread.sleep(1000);
        HashMap<String, String> fossils = new HashMap<String, String>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get("Bird Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get("Fish Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get("Tooth Fossil"));
        }

        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<String>();

        supplies.add("Space Suit");
        supplies.add("Laser Rifle");
        supplies.add("Metal Detector");

        System.out.println("Supplies before expedition: " + supplies);

        supplies.remove("Laser Rifle");

        System.out.println("Supplies after expedition: " + supplies);

    }
}
