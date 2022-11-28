package j01_출력;

/**
 *
 */
public class PrintTest1 {
    public static void main(String[] args) { //public, class, static, void 는 예약어임)
        //한줄 주석

        /*
        여러줄 주석
         */

        /**
         *
         * 해당 class, 해당 method 의 역할을 '명시' 또는 '설명'하기 위한 주석
         */

        // 문자열 출력
        System.out.print("이름: ");  // console 창에 출력할 때 out 사용, ctrl+Shift+f10
        //'' : 한글자 입력 가능  "":여러글자 입력 가능
        // '\n' : 줄바꿈 명령어
        System.out.println("\'김경민\'"); // 이렇게 두가지 코드로 입력해도 나란히 console 창에 나열됨
        System.out.print("주소 : ");
        System.out.println("부산 북구 금곡동");
        //'println' : 자동으로 줄바꿈, \n 사용할 필요없음

        boolean isUsernameCheck = true; //camel 표기법 : alt+shift +u
    }
}
