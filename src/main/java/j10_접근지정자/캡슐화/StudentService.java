package j10_접근지정자.캡슐화;

public class StudentService {

    public void registerStudent(){

        System.out.println("[ 학생 정보 등록 메뉴 ]");
        System.out.println("먼저 중복된 학생 정보인지 확인합니다.");
        doubleCheckStudent("김준일");
        System.out.println("학생 정보를 등록합니다.");

    }

    private boolean doubleCheckStudent(String studentName){  //등록할 때 한번만 쓰임. public -> private , 내부(StudentService)에서 한번만 쓰이니까
    //doubleCheckStudent 라는 메소드를 거쳐야만 쓸수 있다.

        if(studentName.equals("김준일")){ //문자열은 ==가 아니라 equals 로 비교한다. "김준일"=="김준일" 이렇게 x
            return false;
        }

        return true;
    }

}
