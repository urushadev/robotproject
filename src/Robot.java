public class Robot {
    int batteryLevel = 100; //Battery Level Percentage (0-100)
    int speed = 0; //Current speed of Robot
    String name = "Robo"; //Name of the robot
    String color= "Red";
    int weight= 50;


    public void move() {
        speed = 5;
        System.out.println(name + " is moving at speed " + speed + "mph.");
    }

    public void stop() {
        speed = 0;
        System.out.println(name + " has stopped.");
    }

    public void checkBatteryLevel() {
        batteryLevel = 100;
        System.out.println(name + "'s battery level is " +batteryLevel+ "%.");
    }

    public void chargeBatteryLevel() {
        System.out.println(name + "'s battery is fully charged.");
    }

    public void displayInfo() {
        System.out.println(name+ " color is "+ color+ " and the weight is "+ weight+ "kg.");
        }
    }

