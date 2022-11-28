package j14_참조자료형캐스팅.동물;

public class AnimalMain {

    public static void main(String[] args) {
        Human human = new Human();
        Tiger tiger = new Tiger();
        Animal animal1 = null;
        Animal animal2 = null;


        System.out.println("[캐스팅 전]");
        human.move();
        human.readBooks();
        tiger.move();
        tiger.hunting();

        System.out.println("[캐스팅]");
        System.out.println("<업캐스팅>");// 반복을 위해 사용

        animal1 = human;
        animal2 = tiger;
        animal1.move();
        animal2.move();

        System.out.println("<다운캐스팅>"); //다운캐스팅을 하려면 업캐스팅이 된 적이 있어야 한다. 업캐스팅에서 animal, human  이면 다운캐스팅 후 업캐스팅 다시해도 그대로임. animal tiger - x
        Human d_human = (Human) animal1;
        Tiger d_tiger = (Tiger) animal2;
        d_human.readBooks();
        d_tiger.hunting();

        System.out.println("----------------------------");
        System.out.println();

        Animal a = new Animal();
        Human h = (Human)a;
        h.readBooks();









    }
}
