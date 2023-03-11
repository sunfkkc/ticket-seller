package optionalSample;


import java.util.Optional;

class Member{

    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    public Member(){
        this("kkc", 25, "sunfkkc", "5214");
    }

    public Member(String name, int age, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
public class Main {

    private static void sample1(){

        Optional<Member> httpRequestBody = Optional.ofNullable(null);

        Member member = httpRequestBody.orElse(new Member());
        Member member1 = httpRequestBody.orElseGet(Member::new);


        System.out.println(member);
        System.out.println(member1);
    }

    public static void main(String[] args) {


        sample1();
    }
}
