package j08_Method;

/**
 * 메소드 overloading
 * 매개변수의 형태가 다르면 ( add()  // add(int a) )
 * 동일한 메소드 명을 가지고 정의할 수 있다.
 */


public class Overloading {

    public static void add() {   // 아래에 같은 이름이면 출력을 뭘 부를지를 모름.
        System.out.println("add()");
    }
    public static void add(int a) {   // int a 가 지정되기 때문에 아래쪽에서 정수값이 오면 출력가능
        System.out.println("add(int a)");

    }

    public static void add(String s) {  // String s 로 지정되기 때문에 아래쪽에서 문자열이 오면 출력가능
        System.out.println("add(String s)");

    }

    public static void add(int a, int b) {
        System.out.println("add(int a, int b)");

    }

    public static void add(int a, String b) {
        System.out.println("add(int a, String b)");
    }

    public static void add(String b, int a) {
        System.out.println("add(String b, int a)");
    }

    public static void main(String[] args) {

        add();
        add(10);
        add("10");
        add(10,20); // 'a:' 'b:' 자동연결임 타이핑 x
        add("20", 10);

    }
}
