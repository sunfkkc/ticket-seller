class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this.color="red";
    }

    void alert(){
        System.out.println("ppang ppang");
    }
}

class FireEngine extends Car{
    String color;

    FireEngine(){
        this.color=super.color;
    }
    void alert(){
        System.out.println("chick chick");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new FireEngine();

        FireEngine fireEngine = new FireEngine();

        car.alert();
        fireEngine.alert();

        System.out.println(car.color);
        System.out.println(fireEngine.color);
    }
}