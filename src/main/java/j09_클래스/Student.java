package j09_클래스;

public class Student {

    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    void increaseStudentYear(){  //호출시 현재 학년을 1학년 증가 ( 최대 5학년 )
        System.out.println(
                studentYear< 5 ? studentYear + 1 : 5

        );

    }

    void showStudentInfo(){  //학생정보출력
        System.out.println("학교: " + schoolName);
        System.out.println("학번: " + studentCode);
        System.out.println("학년: " + studentYear);
        System.out.println("이름: " + name);
        System.out.println();

    }
}
