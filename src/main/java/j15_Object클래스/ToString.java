package j15_Object클래스;

import java.sql.SQLOutput;

public class ToString {

    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest("김준일", "부산");

        System.out.println(objectTest);
        System.out.println(objectTest.toString()); // toString 을 쓸 때가 있고 생략할 때가 있다.

        String str = objectTest.toString(); // objectTest는 클래스이기 때문에 String 변수설정(?) 할수 없다.
        System.out.println(str);
        System.out.println(objectTest.showInfo());

        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        Teacher teacher2 = new Teacher("김준이", "부산교육대학원");

        System.out.println(teacher1);
        System.out.println(teacher2);







    }
}
