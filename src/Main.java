public class Main {
    public static void main (String[]args) {
        Robot myRobot= new Robot(); //create a new robot object
        myRobot.move();
        myRobot.stop();
        myRobot.checkBatteryLevel();
        myRobot.chargeBatteryLevel();
        myRobot.displayInfo();
    }
}