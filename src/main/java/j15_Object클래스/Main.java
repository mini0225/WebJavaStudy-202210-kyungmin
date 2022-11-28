package j15_Object클래스;

public class Main {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest();

        int hashCode = objectTest.hashCode(); //아무것도 작성안했는데 메소드는 나옴.

        System.out.println(hashCode);
        System.out.println(Integer.toHexString(hashCode));  //integer를 16진수로 바꿔라. hashCode를 16진수로 바꿔라

        System.out.println(objectTest); //주소가 튀어나옴.







    }

}
