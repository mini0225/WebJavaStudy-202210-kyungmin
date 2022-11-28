package j16_Bean;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor  //final 을 가지는 애들만 조진다
@AllArgsConstructor // 얘는 전부다 조짐

public class PersonRequired {

    private final String name; //맴버 변수에 final 을 선언하면 필수값이 된다.
    private int age;

}
