package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringList {

    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<String>();

//        list.add("김");
//        list.add("준");
//        list.add("일");
//
//        System.out.println(list.get(1));


        ArrayList<String> list = new ArrayList<String>();
        printCollection(list);

        //값 추가
        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
        list.add("문자열4");
        printCollection(list);

        list.add(1,"문자열5");
        printCollection(list);

        ArrayList<String> addAllList = new ArrayList<String>();
        addAllList.addAll(list);
        addAllList.addAll(2, list);
        printCollection(addAllList);

        // 값 조회
        String str1 = list.get(0); //index 개념임 0번째 문자열을 꺼내라.
        System.out.println("str1 : " + str1);
        System.out.println();

        //반복을 사용한 값 조회
        for(int i = 0; i<list.size(); i++){
            System.out.println("일반 for - str : " + list.get(i));
        }

        System.out.println();

        for(String str : list) { //list의 끝까지 반복해서 출력
            System.out.println("forEach - str : " + str);
        }

        System.out.println();

        Iterator<String> iterator = list.iterator(); // forEach와 거의 동일한 구성, 반복자 : iterator 비우면서 출력하는 개념

        System.out.println("interator 첫 생성시 : " + iterator.next() + "출력"); //문자열 1 번이 우선출력 , 아래쪽에서 while 실행될때는 5번부터출력

        System.out.println();
        while (iterator.hasNext()){ //hasNext : iterator 안에서 다음이 있냐??? 비우면서 출력하니까 다음있냐고 계속 물으면서 없어지면 false 가 되면서 출력이 안된다. 그러고 텅빈다.
            System.out.println("iterator - str : " + iterator.next());
        }
        System.out.println();

        //System.out.println(iterator.next()); // 위에서 출력을 다해서 방이 다 비었기 때문에 출력할 값도 존재하지 않음.
        //항상 hasNext 와 함께 사용할 것

        //값 수정
        list.set(1,"문자열6");
        printCollection(list);

        //값 삭제
        list.remove(0);
        printCollection(list);

        for(int i = 0; i<list.size(); i++){
            if(list.get(i).equals("문자열3")){
                list.remove(i); //list에서 밀리는 작업을 break 걸어준다
                break;
            }
        }

        list.add("문자열2");
        printCollection(list);

        //값의 위치 찾기 index of
        int index = list.indexOf("문자열2");
        System.out.println("문자열 2의 위치 : " + index);

        //값을 뒤에서 부터 찾는다

        int lastIndex = list.lastIndexOf("문자열2");
        System.out.println("뒤에서 부터 찾은 문자열2의 위치 : " + lastIndex) ;

        System.out.println();

        //값을 포함하고 있는지 여부 조회
        boolean isTrue = list.contains("문자열5");
        System.out.println("List에 문자열5가 포함되어 있는가? " + isTrue);

        System.out.println();

        //리스트를 배열로 변환
        Object[] objects = list.toArray();
        System.out.println(objects[0]);

        for(Object object : objects){
            System.out.println(object);
        }




    }

    public static void printCollection(Collection collection){
        System.out.println(collection);
        System.out.println();
    }





}
