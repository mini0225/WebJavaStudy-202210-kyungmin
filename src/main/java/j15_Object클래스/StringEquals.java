package j15_Object클래스; //어떤 자료형을 다 받을 수 있다. 대신 사용할 때는 다운캐스팅 필요

public class StringEquals {

    public static void main(String[] args) {

        String name1 = "김준일"; // name1 , name2 는 just 문자열임. 김,준,일 각각의 char 값
        String name2 = "김준일";
        String name3 = new String ("김준일"); //새로 생성한 공간에 주소가 담긴다  그래서 name3, name4 는 주소가 다름.
        String name4 = new String ("김준일");


        System.out.println(name1 + ", " + name2 + ", " + name3);

        System.out.println(name1 == name2); // → true 출력
        System.out.println(name1 == name3); // → false 출력
        System.out.println(name3 == name4); // → false 출력
        System.out.println(name1.equals(name3)); // → true 출력 , equals는 문자열의 값을 비교함.







    }
}
