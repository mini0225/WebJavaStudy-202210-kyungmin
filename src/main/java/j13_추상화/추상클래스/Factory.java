package j13_추상화.추상클래스;

/*
abstract : 추상적인

추상 클래스

1. abstract 메서드가 클래스 내에 하나라도 있을 경우, 그 클래스 자체는 abstract 클래스로 정의되어 져야 한다!
2. 추상 클래스는 생성할 수 없다.
3. 그 외의 다른 특징은 일반 클래스와 동일하다.
 */

public abstract class Factory {   // 설계도 느낌~

    private String name;

    public Factory(String name){  //생성자를 자체적으로 정의할 순 있지만 호출은 안됨.
        this.name = name;
    }

    public abstract void produce(String model); // { }  // { } : 구현부
    public abstract void management();

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void printInfo(){
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장이름 : " + name);

    }

}

