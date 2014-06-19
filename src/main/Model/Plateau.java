package Model;

/**
 * Created with IntelliJ IDEA.
 * User: shubham
 * Date: 16/06/14
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Plateau {
    public static Plateau instance = null;
    int xLimit, yLimit;

    public Plateau(String input){
        String[] inputForLimits = input.split(" ");
        if(inputForLimits.length != 2)
            throw new IllegalArgumentException("Input string should not have more than 2 arguments");
        createPlateauFromTheInputString(inputForLimits);
    }

    protected Plateau() {
        //To change body of created methods use File | Settings | File Templates.
    }

    private void createPlateauFromTheInputString(String[] inputForLimits) {
        int xLimit = Integer.parseInt(inputForLimits[0]);
        int yLimit = Integer.parseInt(inputForLimits[1]);
        createPlateau(xLimit,yLimit);
    }

    private void createPlateau(int xLimit, int yLimit) {
        if(instance == null) {
            createFirstInstance(xLimit, yLimit);
        }
        assignTheValueFromTheFirstInstance();
    }

    private void assignTheValueFromTheFirstInstance() {
        this.xLimit = instance.xLimit;
        this.yLimit = instance.yLimit;
    }

    private void createFirstInstance(int xLimit, int yLimit) {
        instance = new Plateau();
        instance.xLimit = xLimit;
        instance.yLimit = yLimit;
    }

}
