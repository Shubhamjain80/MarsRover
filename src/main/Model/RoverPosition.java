package Model;

import Constants.*;

import java.util.HashMap;
import java.util.Map;


public class RoverPosition {
    public int xPosition, yPosition;
    public Direction direction;

    public RoverPosition(String[] input){
        int xPosition = Integer.parseInt(input[0]);
        int yPosition = Integer.parseInt(input[1]);
        String directionString = input[2];
        Direction direction = getDirectionForString(directionString);
        createRoverPositionWith(xPosition,yPosition,direction);
    }

    public void increaseXPosition(){
        xPosition++;
    }
    public void increaseYPosition(){
        yPosition++;
    }
    public void decreaseXPosition(){
        xPosition--;
    }
    public void decreaseYPosition(){
        yPosition--;
    }

    public String outPutInFormattedString() {
        String output = String.valueOf(xPosition);
        output+=String.valueOf(yPosition);
        output+=String.valueOf(direction.getValue());
        return output;
    }

    protected void moveRover(char input) {
        switch (input){
            case 'L':
                turnLeft();
                break;
            case 'R':
                turnRight();
                break;
            case 'M':
                moveForward();
                break;
            default:
                throw new IllegalArgumentException("Please give the right moving commands");
        }


    }

    private void createRoverPositionWith(int xPosition, int yPosition, Direction direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }


    private void turnLeft() {
        direction= direction.getLeftDirection();
    }

    private void turnRight(){
        direction= direction.getRightDirection();
    }
    private void moveForward(){
         direction.moveForward(this);
    }

    private Direction getDirectionForString(String directionString) {

        Map<String, Direction> directionMap = new HashMap();
        directionMap.put("N", new North());
        directionMap.put("S", new South());
        directionMap.put("E", new East());
        directionMap.put("W", new West());
        if(!directionMap.containsKey(directionString))
            throw new IllegalArgumentException("Wrong direction");
        return directionMap.get(directionString);
    }

}
