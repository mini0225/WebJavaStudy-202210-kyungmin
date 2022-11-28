package J23_예외;

public class Exception1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7};

        try{  //예외발생부분

            String a = null;
            a.toLowerCase(); //<- if 랑 유사함. 첫번째 예외 던져서 ArrayIndexOutOfBoundsException 에 들어갔다가 아니면 null~~로 감.


            for (int i = 0; i<8 ; i++){
                System.out.println(numbers[i]);
            }

        }catch(ArrayIndexOutOfBoundsException e) {  // 예외를 받는다, exception 을 상속받는 애들만 들어올수있음.
            // ArrayIndexOutOfBoundsException 대신 NullPointerException 은 들어오면 예외를 받는다..? 생긴다??
            System.out.println("예외를 처리하였습니다.");
        }catch(NullPointerException e) {
            System.out.println("null pointer to exception");
        }finally { //오류 없어도 실행되고, catch로 받아도 실행됨.
            System.out.println("항상 실행되어야 하는 서비스");
        }

        System.out.println("프로그램 정상 종료");



    }
}
