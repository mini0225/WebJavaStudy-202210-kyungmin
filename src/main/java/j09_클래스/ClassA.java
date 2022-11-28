package j09_클래스;

/**
 * Class = 틀
 */


public class ClassA {

    int num;
    String name;
    double score;

    //생성자 ClassA가 생략되어있다.
    //생성자는 클래스 명과 동일, 반환 자료형을 따로 정의 하지 않는다.
    //생성자는 항상 주소가 반환된다.
    //생성자는 overloading이 된다. 출력도 가능

    ClassA(){  // 매개변수가 없는 생성자 no arragument ...  머시기

    }
    ClassA(int a){

        System.out.println("a: " + a); // overloading 된 생성자가 있으면 기본생성자는 죽음.
        System.out.println("ClassA를 생성합니다.");  //출력시 생성자의 호출이 먼저 일어남.

    }

    void callName(){   //public static 안붙여도됨.
        System.out.println(name + "을(를) 부릅니다.");

    }

}
