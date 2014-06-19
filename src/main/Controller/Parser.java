package Controller;

import Model.Rover;

/**
 * Created by shubham on 18/06/14.
 */
public class Parser {

    private String roverPosition;
    private String inputForMovingRover;
    private Rover rover;

    public Parser(String roverPosition, String inputForMovingRover) {

        this.roverPosition = roverPosition;
        this.inputForMovingRover = inputForMovingRover;
    }

    public String parseInput(){
        rover = new Rover(roverPosition);
        return moveRover(inputForMovingRover);
    }

    private String moveRover(String inputForMovingRover) {
        for (int i = 0; i < inputForMovingRover.length(); i++) {
            char input = inputForMovingRover.charAt(i);
            rover.moveRover(input);
        }
        return rover.outputInFormattedString();
    }


}
