import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TreeMapEx1 {
    static void print(Stream stream){
        stream.forEach(System.out::println);
    }
    public static void main(String[] args) {

//        Stream<String[]> stream = Stream.of(new String[]{"abc","def","jkl"}, new String[]{"ABC","GHI","JKL"});

//        print(stream.flatMap(Arrays::stream));
//
//        String[] strings = {"im find thank you","and you?"};
//
//        Stream<String> stream1 = Stream.of(strings);
//
//        print(stream1.flatMap(s -> Stream.of(s.split(" "))));

        Stream<String> stream = Stream.of("abc","def");

        System.out.println(stream.toArray()[0]);


//        Student[] students = { new Student("김기찬",3,300),new Student("이기찬",1,200),new Student("박기찬",2,100),new Student("최기찬",2,150), new Student("소자바",1,200), new Student("나자바",3,290), new Student("소자바",3,180)};
//
//        Stream<Student> studentStream = Stream.of(students);
//
//        studentStream.sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
//
//        studentStream = Stream.of(students);
//        IntStream stuScoreStream = studentStream.mapToInt(Student::getTotalScore);


    }

}

class Student implements Comparable<Student>{
    String name;
    int ban;
    int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int reverseBan(){
        return -ban;
    }

    @Override
    public String toString() {
        return String.format("{%s, %d, %d}",name,ban,totalScore);
    }

    public int compareTo(Student s){
        return this.totalScore - s.totalScore;
    }
}