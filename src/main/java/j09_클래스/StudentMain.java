package j09_클래스;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println(new Student());
        System.out.println(new Student());

        Student a1 = new Student();
        Student a2 = new Student();

        a1.schoolName = "부산대학교";
        a1.studentCode = 20220001;
        a1.studentYear = 2;
        a1.name = "김준일";

        a2.schoolName = "부경대학교";
        a2.studentCode = 20221001;
        a2.studentYear = 2;
        a2.name = "김경민";

        a1.showStudentInfo();
        a2.showStudentInfo();

        a1.increaseStudentYear();


    }
}
