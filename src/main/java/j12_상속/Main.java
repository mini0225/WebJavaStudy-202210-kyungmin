package j12_상속;

public class Main {

    public static void main(String[] args) {

        //Animal animal = new Animal();
        Human human = new Human("김준일");  // 현재 확장되어 있기 때문에 human 만 생성해도 animal 클래스가 같이 생성된다.
        Tiger tiger = new Tiger("나비");


        //animal.move();
        human.move();  //human과 tiger 클래스에 move 메서드를 주석처리 했어도 클래스 명에 'extends Animal'를 써 줌으로써 Animal에서 쓰는 move 메서드를 사용가능
        tiger.move();  //메서드 오버 라이딩, human과 tiger 의 move 위에 커서를 갖다 대면 위치(?)가 나옴, 부모에서 정의된 "움직입니다"를 해당 클래스의 move정의로 재정의.

        System.out.println("사람이름 : " + human.getName());
        System.out.println("호랑이이름 : " + tiger.getName());




    }
}
