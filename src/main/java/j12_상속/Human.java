package j12_상속;

public class Human extends Animal {  //extends Animal(부모) 확장 : 원래의 human에서 animal 을 확장해서 추가 (human+animal)

    public Human(String name){  // human 에서 생성이 되면 animal 에서 같이 생성이 된다.


        //super(); //무조건 부모(animal)의 주소를 가져온다. 'super.' 부모의 개체에 접근한다. 항상 생략되어있음.
        //super("준일");  // 휴먼이 생성될때 super 생성자(기본생성자) 가 먼저 생성된다.
        super(name);
        //super.move(); // 보모의 name move를 갖고온다.  this 는 자기꺼 들고온다.
        System.out.println("Human 생성");
        //System.out.println("human생성") 과 super(name) 의 순서는 이렇게 해야함 부모(animal)가 만들어져야 자식이 있는것 처럼.

    }

    /*
        메서드 오버라이딩(or 오버라이드)
        [재정의]
        상위(animal) 객체의 메소드를 하위(human, tiger) 객체에서 다시 정의하는 행위

     */

    @Override  //오버라이딩이 일어나면 달아줘야함, 단지 해당 메서드가 '상위 객체로부터 재정의된 메서드 입니다'라는 것을 '표기'하기 위함.
    // @-- : '어노테이션' 이라고 함.
    public void move(){  //부모에 move가 있지만 자식에서 move 메서드가 선언이 된다.

        //그냥move는 자기 자신꺼.
        super.move(); //부모꺼

        System.out.println("두발로 걷습니다.");

    }

//    public void runMove(){
//
//        //name(); 상속을 받았어도 private 메서드??변수??는 호출할 수 없음.
//        move(); //현재 확장되어 있기 때문에 human 클래스 에서 animal 클래스의 move 메서드를 호출할 수 있다.
//
//
//
//    }

}
