package j09_클래스.Student풀이;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(); //방설정 해야 아래쪽이 일어남.
        Student s2 = new Student();

        s1.schoolName = "부산대학교";
        s1.studentCode = 20220001;
        s1.studentYear = 1;
        s1.name = "김준일";

        s2.schoolName = "부경대학교";
        s2.studentCode = 20221001;
        s2.studentYear = 2;
        s2.name = "김경민";

        s1.showStudentInfo();
        s2.showStudentInfo();

//        System.out.println("<<<<학년증가 반복 >>>>");
//        for(int i = 0 ; i<10; i++){  //10번반복
//            s1.increaseStudentYear();
//        }

        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);


        s1.showStudentInfo();

        s2.increaseStudentYear(2);
        s2.increaseStudentYear(5);  // return 이 되어서 아예 info는 아예 출력이 안됐음.

    }

}
