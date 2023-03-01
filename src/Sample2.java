import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.*;
import java.util.function.Function;

public class Sample2{

    public static void main(String[] args) {

        MyArrayList<String> myArrayList = MyArrayList.asList("1","2","3");

        MyFunction myFunction = (String name) -> {
            System.out.println(name);
        };

        myArrayList.aMethod(myFunction);

        myFunction.myMethod("test");


        Function<String,Integer> function = name -> name == "kkc" ? 1 : 0;

        System.out.println(function.apply("kkc"));

        ArrayList<Integer> list = new ArrayList<>();

        list.forEach(i-> System.out.println(i));


    }

}


class MyArrayList<T>{
    T[] arr;

    MyArrayList(T... arr){
        this.arr = arr;
    }

    public static<T> MyArrayList<T> asList(T... a){
        return new MyArrayList<>(a);
    }

    void aMethod(MyFunction f){
        f.myMethod("test");
    }
}


class VarArgEx{
    static String concatenate(String delim, String... args){
        String result = "";

        for(String str : args){
            result += str + delim;
        }

        return result;
    }
}
@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo{
    int count() default 1;
    String testedBy();

    String[] testTools() default "JUnit";
    TestType testType() default TestType.FIRST;
    DateTime testDate();
}

enum TestType { FIRST, FINAL}
@Retention(RetentionPolicy.RUNTIME)
@interface DateTime{
    String yymmdd();
    String hhmmss();
}
@FunctionalInterface
interface MyFunction{
    void myMethod(String name);

}