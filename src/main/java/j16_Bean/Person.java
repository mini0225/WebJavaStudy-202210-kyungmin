package j16_Bean;

public class Person {

    private final String name; //맴버 변수에 final 을 선언하면 필수값이 된다.
    private int age;

    //public Person(){} //기본생성자 NoArgsConstructor는 RequiredArgsConstructor와 함께 쓸 수 없다.

    public Person(String name) { // 필수값은 초기화 필요  RequiredArgsConstructor
        this.name = name;

    }

    public Person(String name, int age) {   //AllArgsConstructor
        this.name = name;
        this.age = age;
    }
}
