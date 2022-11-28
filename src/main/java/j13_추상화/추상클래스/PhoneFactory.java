package j13_추상화.추상클래스;

public class PhoneFactory extends Factory { //확장이 이뤄지면 자식 또한 추상 클래스가 된다. 즉 강제성을 띄게 되어 구현을 해야한다.
    // 1:n 불가능 다른 추상 클래스를 가져올수 없다. 부모는 한분^^
    // 22.11.01배우는 인터페이스는 1:n 가능, 인터페이스는 기능적인 부분을 모듈화

//    @Override
//    public void produce(String model){
//        System.out.println("[" + model + "]모델 스마트폰을 생산합니다.");
//
//
//    }  생성을 하게 되면 정의되지 않기 때문에 PhoneFactory 클래스가 무용지물이된다

    public PhoneFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model){
        System.out.println("[" + model + "]모델 스마트폰을 생산합니다.");
    }

    @Override
    public void management(){
        System.out.println("공장을 관리합니다.");
    }

}
