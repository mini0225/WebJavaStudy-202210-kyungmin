package j14_참조자료형캐스팅;


/* 중앙제어 */

public class CentralControl {

    private Power[] deviceArray;


    public CentralControl(Power[] deviceArray){
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device){
        int emptyIndex = checkEmpty();
        if(emptyIndex == -1){
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            System.out.println();
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + "장치가 연결되었습니다.");
        System.out.println();

    }

    private int checkEmpty () { //쭉 반복되다가 비어있는 Index가 있으면 해당 Index 출력,, 끝까지 가도 없으면 -1 출력,, 그럼 위로 가서 '더이상~' 출력함
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null){
                return i;
            }
        }

        return -1;
    }



    public void powerOn(){
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null) continue;

            deviceArray[i].on();
        }
    }

    public void powerOff(){
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null) continue;

            deviceArray[i].off();
        }

    }


}
