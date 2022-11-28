package j09_클래스.Student풀이;

public class Student {

    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    void increaseStudentYear(){
        studentYear++;  //1씩 계속증가
        if(studentYear >5){
            System.out.println("더 이상 학년을 증가시킬 수 없습니다.");
            studentYear--; //5보다 커버리면 -1
            return; // 5보다 커질때 "더이상~" 출력하고 -1 이되고, 그 순간 증가가 일어나지 않는다 + showStudentInfo도 안됨.
        }
        showStudentInfo(); //increaseStudentYear를 실행시키면 안에 info가 포함되어 있기 때문에 같이 나옴.
    }

    void increaseStudentYear(int year){
        studentYear += year;  // 자기자신한테 year를 더해서 대입.
        if(studentYear > 5){
            System.out.println(year + "학년을 더하면 " + studentYear + "학년이 되어서 5학년을 넘어섭니다.");
            System.out.println("더 이상 학년을 증가시킬 수 없습니다.");
            System.out.println();
            studentYear -= year; //더한만큼 빼고 마무리를 해줘야 다음 showStudentInfo 출력시에 5학년으로 출력된다.
            return; //위에꺼 다 하고 if 문 마무리 되는거임.
        }
        showStudentInfo();
    }

    void showStudentInfo(){
        System.out.println("학교: " + schoolName);
        System.out.println("학번: " + studentCode);
        System.out.println("학년: " + studentYear);
        System.out.println("이름: " + name);
        System.out.println();

    }
}
