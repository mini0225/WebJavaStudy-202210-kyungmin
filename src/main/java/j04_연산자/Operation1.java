package j04_연산자;

public class Operation1 {
    public static void main(String[] args) {
        int num = 10;
        num = num +1 ;
        System.out.println(num);

        /* ++num  num++
        System.out.println(num); 도 가능
         */

        System.out.println(++num); // +1  , 선증가 해서 출력됨
        System.out.println(num);  //앞에서 +1 이 되었기 때문에 12로 나타남.

        System.out.println(num++); // 후증가 되서 다음 출력에 반영되어 출력
        System.out.println(num);  //13

        // -- 도 마찬가지
        System.out.println(--num);


    }

}
