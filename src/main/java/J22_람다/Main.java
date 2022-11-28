package J22_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        //Runnable : 스레드에서 많이 쓰인다
        Runnable runnable1 = () -> {
            System.out.println("첫번째 프로그램을 실행합니다.");
        };
        Runnable runnable2 = () -> {
            System.out.println("두번째 프로그램을 실행합니다.");
        };

        runnable1.run();
        runnable2.run();


        //thread 는 동시에 실행된다. 원래라면 thread1 의 for 문이 먼저 다 실행되고 thread2 의 for 문이 실행되어야 한다.
        Thread thread1 = new Thread(() -> { //-> 람다로 구현되어잇음.
            for (int i =0; i>100; i++){

                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드1: " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i =0; i>100; i++){

                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드2: " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

//        thread1.start();
//        thread2.start();

        Supplier<String> supplier = () -> "공급";
        System.out.println(supplier.get());

        Consumer<String> consumer = (name) -> { // 매개변수가 '하나'일때는 (name)에서 괄호를 없앨수 있다. 없거나 두개부터는 생략 불가능!
            System.out.println("이름 : " + name);
        };
        consumer.accept("김준일");

        Function<Integer, String> function = age -> "나이 : " + age;
        System.out.println(function.apply(32));

        Predicate<Integer> leapMonth = year -> year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(leapMonth. test(2000));


    }
}
