package j18_제네릭.와일드카드;

public class Main {
    public AnimalData<? extends Animal> getAnimal(int flag) { //extends Animal 작성해서 제한하기
        if(flag ==1) {
            AnimalData<Human> animalData = new AnimalData<Human>(new Human()); // 자료형이 Human 이니까 new 'Human' 임
            return animalData;
        }else if (flag ==2) {
            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData; //메소드의 자료형이 <Human>이면 return 안댐.  → ?바꿔주면 가능, 어떠한 형태가 와도된다는 뜻
//        }else if (flag ==3) {
//            AnimalData<Car> animalData = new AnimalData<Car>(new Car("K8"));
//            return animalData; //메소드의 자료형이 <Human>이면 return 안댐.  → ?바꿔주면 가능, 어떠한 형태가 와도된다는 뜻
//        }else{           // 위에서 <?> 제한해서 Car 클래스에서 animal이 같이 안걸려 있어서 안댐.

        }
        return null;
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.getAnimal(2));

    }
}
