package J24_forEach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class CollectionForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("김준일");
        list.add("김경민");
        list.add("김완준");
        list.add("이동빈");
        list.add("이종준");

        for(String name : list) {
            System.out.println(name);
        }

        list.forEach(name -> { //아래의 Consumer, for 하나로 합친거. foreach 의 매개변수가 람다로 잡혀있기 때문에 자동으로....된다........
            System.out.println(name);
        });

        Consumer<String> consumer = name ->{
            System.out.println(name);

        };
        for(String name : Objects.requireNonNull(list)) {
            consumer.accept(name);
        }

        Set<Integer> numbers = new HashSet<Integer>();
        for(int i = 0; i<100 ; i++){
            numbers.add(i+1);
        }

        AtomicInteger result = new AtomicInteger(); //람다때 쓰임.

        numbers.forEach(num -> {
            result.addAndGet(num); //get 가지고 온다 . 가지고와서 더해라
        });
        System.out.println(result.get());


        Map<Integer, String> students = new HashMap<Integer, String>();
        for(int i =0; i<10 ; i++) {
            students.put(20220001+i, "김준"  + (i+1));
        }
        students.forEach((key, value) ->{
            System.out.println("학번: " + key+ ", 이름"  +value);
        });


    }
}
