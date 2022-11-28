package J21_익명클래스;

public class AdditionMain1 {

    public static void main(String[] args) {
        Addition<String> stringAddition = new AdditionImpl<String>(); //interface는 생성할 수 없다. implements 해서 interface를 구현한 class를 만들어 준다. (제네릭)
        //업캐스팅..........
        String str = stringAddition.add("문자열");
        System.out.println(str);

        Addition<Integer> integerAddition = new Addition<Integer>() { // 한번만 생성하고 재사용 불가능

            @Override //interface를 재정의???????????????????????? 동일한 interface를 여러번 사용하기 위해 ???????????
            public Integer add(Integer values){

                return null;
            }

        };
    }
}
