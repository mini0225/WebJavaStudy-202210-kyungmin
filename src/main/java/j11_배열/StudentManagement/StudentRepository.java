package j11_배열.StudentManagement;

public class StudentRepository {

    private Student[] students;

    public StudentRepository(){
        students = new Student[0];
    }



    public void addStudent(Student student){
        int index = indexOfEmpty();

        if(index == -1){  // 이거는 공간이 없을때 일어난다.
            index = increaseArray();
        }

        students[index] = student;


    }

    private int indexOfEmpty(){
        for(int i =0; i < students.length; i++){
            if(students[i] == null){
                return i;
            }
        }
        return -1;
    }
    private int increaseArray(){
        Student[] tempArray = new Student[students.length+1];
        for(int i=0; i < students.length; i++) {
            tempArray[i] = students[i];
        }
        students = tempArray;

        return tempArray.length -1;  // tempArray.length = students.length

    }

    public Student[] getStudents(){
        return students;  //위의 private student 를 등록(?) 한다.


    }

    public int findStudentByName(String name){   //이름으로 학생정보를 찾는다.
        for(int i = 0 ; i < students.length; i++){  //array에서 중간에 학생정보(객체) 지워지면 null 으로 존재
            //객체가 존재하는지 먼저 확인을 하고 null이면 제끼고 있으면 name 대조해서 일치하면 출력(?)
            if(students[i] != null){ //null 이 아니면~(!=)
                if(students[i].getName().equals(name)){  //학사정보에서 private 값이니까 getName 설정 필요
                    return i;
                }
            }
        }

        return -1;
    }

    public Student getStudent(int index){  //학생의 위치를 가져온다.
        return students[index];


    }

    public Student removeStudent(int index){     //학생지우기
        Student student = students[index]; //해당배열 학생 데려온다
        students[index] = null;  // 그 해당 학생배열에 null 을 부여 해서 지운다.
        return student;
    }

    public Student updateStudent(int index, Student updateStudent){
        Student student = students[index];
        student.updateStudent(updateStudent);
        return student;

    }



}


