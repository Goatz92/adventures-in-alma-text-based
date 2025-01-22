import player.PlayerChoice;
import story.print.StoryPrintables;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        do {
            //Game Start
            storyStart();
        }
        while (!"quit".equals(getPlayerChoice()));
        {
            //Present the player with choices

        }
    }

    public static String getPlayerChoice() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static void storyStart() {
        System.out.println("Welcome to the Adventures Of Alma");
        System.out.println("To Quit type quit");
        System.out.println("You find yourself in the Town of Riverbridge.");
        System.out.println("It was here where the last battle " +
                "between the forces of the Four Kingdoms of Alma " +
                "versus the Thel'Qarim, took place.");
    }
}
