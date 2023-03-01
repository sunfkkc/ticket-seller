import java.util.ArrayList;

interface Parseable{
    public abstract void parse(String fileName);
}

class Box<T>{
    ArrayList<T> list = new ArrayList<T>();

    ArrayList<T> getList (){ return list;}
}

public class Sample{
    public static void main(String[] args) {
        Box box = null;
        Box<Object> box1 = null;
        Box<String> box2 = null;

        box2 = (Box<String>) new Box();

        Box<? extends Object> box3 = new Box<String>();

        FruitBox<Apple> fruitBox = new FruitBox<>();

        Juicer.makeJuice(fruitBox);

        Box<? extends Object> box4 = null;

        Box<String> box5 = (Box<String>)box4;



    }
}

class Juicer{
    static <T extends Fruit>Juice makeJuice(FruitBox<T> box){
        String tmp="";

        for(Fruit f : box.getList()) tmp += f + " ";
        return new Juice(tmp);
    }
}

class FruitBox<T extends Fruit> extends Box<T>{
}

class Fruit{}
class Apple extends Fruit{}
class Grape extends Fruit{}

class Juice{
    String name;

    Juice(String name){
        this.name = name + "Juice";
    }
}