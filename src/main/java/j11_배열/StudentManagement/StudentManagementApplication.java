package j11_배열.StudentManagement;

import java.util.Scanner;

public class StudentManagementApplication {

    public static void main(String[] args) {

        //StudentRepository studentRepository = new StudentRepository();
        //StudentService studentService = new StudentService(new Scanner(System.in), StudentRepository);  //service 생성자가 생성되려면 매개변수 필요
                                                                            // 위에 두개 자체로 값임. 맨위에 주석처리 한게 안으로 들어와도 상관없음.

        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService(scanner, new StudentRepository());
                                            //각각 객체 scanner 와 repository 를 우선생산하고 service를 생성한다.
//        studentService.registerStudent();
//        studentService.registerStudent();
//        studentService.showStudents();
//        studentService.showStudent();  잠시주석ㅎㅎ
//        studentService.deleteStudent();
//        studentService.showStudents();
//        studentService.deleteStudent();
//        studentService.showStudents();
//        studentService.modifyStudent();
//        studentService.showStudent();

        String select = null;

        while(true){ //무한 반복하다가 q를 만나야 break
            System.out.println("[학생 관리 프로그램 메뉴}");
            System.out.println("1. 학생 전체 조회");
            System.out.println("2. 학생 등록");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 학생 정보 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            select = scanner.nextLine();

            if(select.equals("q")){
                break;
            }else if(select.equals("1")){
                studentService.showStudents();
            }else if(select.equals("2")){
                studentService.registerStudent();
            }else if(select.equals("3")){
                studentService.modifyStudent();
            }else if(select.equals("4")){
                studentService.deleteStudent();
            }else if(select.equals("5")){
                studentService.showStudents();
            }else {
                System.out.println("잘못된 입력!! 다시 입력하세요");
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }

        System.out.println("프로그램 종료!!");
    }

}
