package j18_제네릭;

import java.util.Date;

public class DataController {

    public static void main(String[] args) {

        Date now = new Date();


        ResponseData<String> responseData = new ResponseData<String>("날짜 저장 성공!", now.toString());
        System.out.println(responseData);

        ResponseData<Integer> responseData2 = new ResponseData<Integer>("번호 저장 성공!", 10); //10 이 오면 안되고 String 이 와야 함. 아니면 하나더 만들어서 integer 가 와야함
        System.out.println(responseData2);

        ResponseData<Date> responseData3 = new ResponseData<Date>("날짜 객체 저장 성공!", now);
        System.out.println(responseData3);

    }
}
