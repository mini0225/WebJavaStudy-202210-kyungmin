package j03_형변환;

public class Conversion {
    public static void main(String[] args) {
        //upcasting(업캐스팅) - 묵시적 형변환 가능
        char cast1 = 'a';
        System.out.println((int) cast1);  //cast1 값을 int 자료형으로 형을 바꿔라 라는 의미  a→97 변경

        int cast2 = (int) cast1;  // cast1 = 97  (int) 굳이 작성 안해도됨
        System.out.println(cast2);

        //downcasting(다운캐스팅) - 명시적 형변환 필요
        int cast3 = 98;
        char cast4 = (char) cast3;  // int는 정수 char 는 문자임으로 나타낼 수가 없음.
        System.out.println(cast4);

        double cast5 = 3.14;
        int cast6 = (int) cast5;
        System.out.println(cast6); //명시적 형변환이 일어났기 때문에 3.14 → 3 으로 표기 됨.
        double cast7 = cast6;
        System.out.println(cast7);  // cast6 은 위에서 3이 되었기 때문에 cast7 은 3.0 으로 표기됨.




    }
}
