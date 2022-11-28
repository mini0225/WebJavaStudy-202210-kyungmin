package j17_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@Data
public class Product {

    public static int autoIncrement = 20220000; //static 은 공유 영역

    private int serialNumber;
    private String productName;

    public Product(String productName){
        serialNumber = ++autoIncrement;
        this.productName = productName;

    }

    public static int getAutoIncrement() {
        return autoIncrement;

    }

    public static void printInfo(){ //메소드 자체는 생성이 되지 않아도 쓸수 있지만 productName 은 생성이 꼭 되어야 쓸수 있는 놈을 갖다 놔서 빨간줄이 뜬다.
        // System.out.println(productName);  //메모리가 할당이 안될수도있다??????? 맴버 변수는 스태틱 메소드에서 사용할 수 없다.
        Product product = new Product("product"); //메모리 할당
        System.out.println(product.productName); // 할당된 메모리가 있기 떄문에 사용가능.

        System.out.println(autoIncrement);

    }


}
