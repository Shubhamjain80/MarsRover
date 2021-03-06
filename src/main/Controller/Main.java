package Controller;

import Model.Plateau;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Plateau plateau;
    static Parser parser;

    public static void main(String[] args) {
        createPlateauAndRoverFromUserInput();
    }

    private static void createPlateauAndRoverFromUserInput() {
        boolean continues = true;
        createPlateauFromInput();
        while (continues)
            createParserFromInput();
    }

    private static void createParserFromInput() {
        String roverPosition = getRoverPosition();
        String inputForMovingRover = getMovingCommands();
        parser = new Parser(roverPosition, inputForMovingRover);
        System.out.println(parser.parseInput());
    }

    private static String getMovingCommands() {
        System.out.println("Give the commands to move the rover");
        return input.nextLine();
    }

    private static String getRoverPosition() {
        System.out.println("Give the value of x-position and y-position and direction for Rover");
        return input.nextLine();
    }

    private static void createPlateauFromInput() {
        System.out.println("Give the value of x-limit and y-limit for Plateau");
        String inputForPlateau = input.nextLine();
        plateau = new Plateau(inputForPlateau);
    }
}
