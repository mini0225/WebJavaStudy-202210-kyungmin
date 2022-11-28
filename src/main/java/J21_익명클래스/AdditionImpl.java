package J21_익명클래스;

// T 는 전부 String
public class AdditionImpl<T> implements Addition<T>{

    @Override
    public T add(T values) {
        System.out.println(values + "데이터들을 합칩니다.");
        return null;

    }
}
