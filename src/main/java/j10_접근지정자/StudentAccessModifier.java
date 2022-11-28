package j10_접근지정자;

public class StudentAccessModifier {

    private int code;
    private String name; //int, String 변수들은 그냥 private 임 외우기....

    public StudentAccessModifier(int code, String name) {
        this.code = code;
        this.name = name;

    }
    // alt + insult 하면 아래의 set, get 다 불러 올 수 있음.


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){  // 메소드는 public -> 위의 private 와 왼쪽의 public 은 불변의 진리 ㅎㅎ
        System.out.println("학번: " + code);
        System.out.println("이름: " + name);



    }



}
