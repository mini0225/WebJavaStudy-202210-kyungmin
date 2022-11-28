package j19_컬렉션;

import java.util.*;

public class StringMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();

        list.add("김준일");
        list.add("이동빈");
        list.add("도정민");
        list.add("최해혁");
        list.add("김준일");

        System.out.println(list);
        System.out.println(list.get(3));

        map.put("kor2022000-j","김준일"); //map 은 add대신 put 을 쓰고 키 값과 같이 입력해준다, 즉 원하는 대로 키값에 value를 잡을 수 있다.
        map.put("kor2022000-l","이동빈"); //키 값은 숫자(0~9 등등) 뿐만이 아니라 다른값도 가능
        map.put("kor2022000-d","도정민"); //set과 동일하게 hash 개념으로 정렬된다.
        map.put("kor2022000-c","최해혁");
        map.put("kor2022000-j2","김준일");

        System.out.println(map);
        System.out.println(map.get("kor2022000-d")); // 지정한 키 값을 가져올수있음.


        /*
            kor2022000-c 학번의 학생의 이름을 김완준으로 변경하라.
         */

        String searchId = "kor2022000-c";
        //put을 사용하여 값 변경->  값을 집어 넣는 행위
        map.put("kor2022000-c", "김완준");
        System.out.println(map);


        //replace를 통한 값 변경 -> 말그대로 replace 하는것.
        map.replace(searchId, "이성욱"); //list 에서의 set() 과 동일.
        System.out.println(map);

        //값 삭제
        map.remove(searchId);
        System.out.println(map);

        boolean searchSuccessflag = map.containsKey("kor2022000-j2"); //원하는 key 값이 들어있니 안들어 있니 true or false
        System.out.println(searchSuccessflag);

        searchSuccessflag = map.containsValue("김준이");
        System.out.println(searchSuccessflag);

        System.out.println("--------------------------------------------");


        Set<Map.Entry<String, String>> entry = map.entrySet(); // entry = key value 를 하나로 묶은 객체
        List<Map.Entry<String, String>> entries = new ArrayList<Map.Entry<String, String>>(); //'Map.' = package

        entries.addAll(entry);

        System.out.println("entry 리스트 : " + entries);

        Iterator<Map.Entry<String,String>> iterator = entry.iterator();
        while(iterator.hasNext()) {
            Map.Entry<String,String> e = iterator.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keySet = map.keySet();

        System.out.println("keySet >>>> " + keySet);

        Collection<String> values = map.values();

        System.out.println("values >>>> " + values);





    }
}
