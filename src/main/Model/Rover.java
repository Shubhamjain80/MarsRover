package Model;

public class Rover {
    public RoverPosition position;

    public Rover(String input){
        makeRoverFromInput(input);
    }

    private void makeRoverFromInput(String input) {
        String[]inputForPosition = input.split(" ");
        if(inputForPosition.length != 3)
            throw new IllegalArgumentException();
        RoverPosition roverPosition = new RoverPosition(inputForPosition);
        initializeRoverWith(roverPosition);
    }

    public void moveRover(char input) {
        position.moveRover(input);
        throwExceptionIfPositionIsNotValid(position);
    }

    public String outputInFormattedString() {
       return position.outPutInFormattedString();
    }

    private void initializeRoverWith(RoverPosition position) {
        throwExceptionIfPositionIsNotValid(position);
        this.position = position;
    }

    private void throwExceptionIfPositionIsNotValid(RoverPosition position) {
        if (!positionIsInValidRange(position))
            throw new IndexOutOfBoundsException();
    }

    private boolean positionIsInValidRange(RoverPosition position) {
        return position.xPosition >= 0 && position.yPosition >= 0 &&
               position.xPosition <= Plateau.instance.xLimit && position.yPosition <= Plateau.instance.yLimit;
    }

}
