package j09_클래스;


//생성자를 통한 값 주입

public class Constructor {

    int num;
    String name;

    Constructor(){  //기본생성자, 아무런 옵션없이 생산
        System.out.println("NoArgsConstructor(기본생성자)");

    }

    Constructor(int num){ //미리옵션추가
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 하는 생성자)");
        this.num = num; // 변수가 두개임(맨위,여기위) -> 지역변수(여기위)의 우선순위가 전역변수(맨위)보다 높다.
        //즉 지역변수 스스로 대입중인거 같음. ->매개변수명을 바꿔줌으로써 해결가능. but 나중에 헷갈림 + 변수명에 숫자쓰면 더러워짐
        //this. 을 씀으로써 샐깔로 구분가능. 주소설정느낌.

    }

    Constructor(String name){
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 하는 생성자)");
        this.name = name;
    }

    Constructor(int num, String name){
        System.out.println("AllArgsConstructor(전체 생성자)");
        this.num = num;
        this.name = name;
    }

    void showInfo(){
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }

}
