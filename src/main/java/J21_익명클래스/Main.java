package J21_익명클래스;

public class Main {

    public static void main(String[] args) {

        //CLass 가 있기때문에 재사용 가능
        Interface1 interface1 = new Class1();
        Interface1 interface2 = new Class1();
        Interface1 interface3 = new Class1();
        Interface1 interface4 = new Class1();
        Interface1 interface5 = new Class1();

        interface1.methodName();
        interface2.methodName();
        interface3.methodName();
        interface4.methodName();
        interface5.methodName();

        //익명클래스 - 굳이 class파일 하나 더 만들지말고 한번만쓸거면 일회용을 만들어라~
        Interface1 interface6 = new Interface1(){//위와 전혀 상관없는 interface1 생성
            @Override
            public void methodName(){
                System.out.println("익명클래스로 정의한 메소드");

            }
        };

        interface6.methodName();


        Interface1 interface7 = new Interface1(){
            @Override
            public void methodName(){
                System.out.println("익명클래스로 정의한 메소드");

            }
        };






    }
}
