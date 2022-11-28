package j17_스태틱.싱글톤;


import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString


public class SmartPhone {  // 폰은 여러개 생산되니까 싱글톤 아님

    private String company;
    private String model;
    private String serial;


}
