package j13_추상화.인터페이스;

//shift + f6 클래스명 변경

/*
    interface(인터페이스)
    1. 기본적으로 모든 메소드가 추상 메소드로 정의된다.
    2. 일반 메소드를 정의하기 위해서는 default 키워드를 사용하여야 한다.
    3. 생성자 정의는 불가능하다.
    4. 일반 변수 선언 불가능하다.
    5. 상수는 선언할 수 있다. (접근지정자 public 사용)

 */

public interface Press { //추상 클래스랑 동일, 생성불가능

    public final String NAME = "button"; //[상수선언, 초기화] , 항상 public


    public void onPressd();  // abstract 가 생략된다  ← public abstract void 에서 생략

//    private String name;              [변수선언]

//    public button(){                  [생성자]
//
//    } 3번내용


//    public default void pop(){        [일반메소드]
//
//    } 2번 내용


}
