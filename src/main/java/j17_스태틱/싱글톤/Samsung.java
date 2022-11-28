package j17_스태틱.싱글톤;


import lombok.Getter;


public class Samsung { //삼성이라는 회사는 only one 이니까 싱글톤

    @Getter //바로아래 company 만 getter 가 생김.
    private String company;
    private int serialNumber;


    private static Samsung instance = null;

    private Samsung(){ //여기서 생성자 호출은 1번밖에 안된다
        company = getClass().getSimpleName();  // 클래스 명 가져오기....
        serialNumber = 20220000;

    }

    public static Samsung getInstance(){
        if(instance == null){
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model){
        return model +"_" + ++serialNumber; //serialNumber 선증가

    }



}
