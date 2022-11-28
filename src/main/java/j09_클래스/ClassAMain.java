package j09_클래스;

public class ClassAMain {
    public static void main(String[] args) {

        System.out.println(new ClassA());  //새로운 ClassA를 생성'해라'. -> 메소드
        System.out.println(new ClassA());  //똑같은 걸 생성하더라도 다 같지 않다. 주소가 다 다르다
        System.out.println(new ClassA());  // ClassA 는 자료형
        System.out.println(new ClassA());  // ClassB 는 담을수 없음, 없어서?


        ClassA a1 = new ClassA(); //변수 a1을 통해서 ClassA가 위치한 주소안의 형태에 '접근'할수있다
        ClassA a2 = new ClassA();  // '.'을 찍어서 ClassA 의 변수에 접근가능 ex) a1.name , a2.int 등등

        a1.name = "김경민";

        System.out.println(a1.name);

        a2.name = "김개미";

        System.out.println(a1.name);
        System.out.println(a2.name);

        a1.callName();
        a2.callName();

    }

}
