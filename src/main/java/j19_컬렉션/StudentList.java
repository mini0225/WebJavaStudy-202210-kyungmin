package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static j19_컬렉션.StringList.printCollection;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        //원하는 학생 꺼내기

        String searchName = "김규민";

        for (Student student : students) {
            if (student.getName().equals(searchName)) {
                System.out.println(searchName + " 학생의 학번 :" + student.getId());
                break;
            }
        }

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (students.get(i).getName().equals(searchName)) {
                System.out.println(searchName + " 학생의 학번 :" + students.get(i).getId());
                break;
            }
        }
        //학생제거
        int searchId = 20220002;

        for (Student student : students) {
            if (student.getId() == searchId) {
                students.remove(students.indexOf(student));
                break;
            }

        }

        for(int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId() == searchId) {
                students.remove(i);
                break;

            }

        }

        System.out.println(students);

        /*
            id = 20220003 인 학생을 찾아서 그 학생의 이름이 김규민 이면 김경민으로 바꿔라.

         */

        searchId = 20220003;

        for (Student student : students) {
            if(student.getId() == searchId && student.getName().equals("김규민")){
                student.setName("김경민");
                break;
            }
        }

        System.out.println(students);

        System.out.println("----------------------------------------");


        for(Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        searchId = 20220004;
        /*
            박경효를 박창우로 변경
         */

        Iterator<Student> iterator = students.iterator(); // forEach와 거의 동일한 구성, 반복자 : iterator 비우면서 출력하는 개념

        while (iterator.hasNext()){ //hasNext : iterator 안에서 다음이 있냐??? 비우면서 출력하니까 다음있냐고 계속 물으면서 없어지면 false 가 되면서 출력이 안된다. 그러고 텅빈다.
            Student student = iterator.next(); //student 를 다 꺼낸다.
            if(student.getId() == searchId){
                student.setName("박창우");
                break;
            }
        }
        System.out.println(students);
        System.out.println("----------------------------------------");


        List<Student> reverseStudents = new ArrayList<Student>();

        for(int i =0; i<students.size();i++){
            reverseStudents.add(students.get(students.size() -1 -i));
        }

        System.out.println(reverseStudents);

        for(Student student : students) {
            reverseStudents.add(0,student);
        }


        System.out.println(reverseStudents);
        System.out.println("----------------------------------------");

        Collections.reverse(reverseStudents);
        System.out.println(reverseStudents);

        System.out.println("----------------------------------------");

        /*
            idList
            nameList
         */


        List<Integer> idList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();

        for(Student student : students) {
            idList.add(student.getId());
            nameList.add(student.getName());
        }

        System.out.println(idList);
        System.out.println(nameList);

        students.clear();

        System.out.println(students);
        System.out.println("----------------------------------------");

        //students 안에는 idList, nameList 만 들어간다.

        for(int i = 0 ; i<idList.size();i++) {
            Student student = new Student(idList.get(i) , nameList.get(i));
            students.add(student);
            }

        System.out.println(students);







    }
}