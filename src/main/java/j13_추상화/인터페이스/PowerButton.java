package j13_추상화.인터페이스;

public class PowerButton extends Button { //인터페이스는 implements 사용 , abstract 는 extends

    private boolean status;  //boolean 은 true or false 임


    @Override
    public void onPressd() {

        if(status){
            status = false;
            System.out.println("전원을 끕니다.");
        }else{
            status = true;
            System.out.println("전원을 켭니다.");

        }


    }

}
