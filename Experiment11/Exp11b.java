package Experiment11;
class Light {

    void turnOn() {
        System.out.println("Light is ON.");
    }
}

class Fan {

    void turnOn() {
        System.out.println("Fan is ON.");
    }
}

public class Exp11b {
    public static void main(String[] args) {

        Light light = new Light();
        Fan fan = new Fan();

        light.turnOn();
        fan.turnOn();
    }
}