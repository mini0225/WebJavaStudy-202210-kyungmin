package j12_상속;

public class Tiger extends Animal {

    public Tiger(String name){
        super(name);

    }

//    @Override
//    public void move(){
//        System.out.println("네 발로 뜁니다.");


//    @Override
//    public void move() {
//        super.move();  //controll + space 를 눌러서 바로 불러올 수 있음.
//    }
//

    @Override
    public void move() {
        super.move();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
