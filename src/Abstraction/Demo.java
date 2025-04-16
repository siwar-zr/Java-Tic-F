package Abstraction;

abstract class Car{

    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing Music..");
    }
}

abstract class Ford extends Car{

    @Override
    public void drive() {
        System.out.println("Driving..");
    }

}

class AdvancedFord extends Ford{


}
public class Demo {

    public static void main(String[] args) {

        Car obj = new AdvancedFord();
        obj.drive();
        obj.playMusic();

    }
}
