package J23_예외;

public class Exception2 {
    public static void printArray(int[] numbers) throws Exception { //throws Exception : 예외를 printArray를 호출한 지점으로 미룬다


        for (int i = 0; i < numbers.length + 1; i++) {
            System.out.println("/" + numbers[i]);

        }
//         catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace(); //<- 정상종료를 시키되 어디서 어떤 오류가 발생 됐는지 알려준다.
//        }
    }

    public static void main(String[] args) {

        if(1==1 ){
            try {
                throw new RuntimeException("예외 강제 생성");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("런타임 예외처리");
            }catch(Exception e ){ //RuntimeException 보다 Exception 이 더 안전. 업캐스팅. 차례대로 되기 때문에 Exception은 마지막에 finally 위에 걸려야 한다.
                e.printStackTrace();
            }finally{
                System.out.println("예외가 발생 하던 하지 않던 항상 실행");
            }
        }
        System.out.println("프로그램 정상 종료");








//        try {
//            printArray(new int[]{1,2,3,4,5});
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        } catch(Exception e){
//            throw new RuntimeException(e); //art + Enter
//        }//throw 예외를 강제적으로 생성한다.  throw != throws
//
//        System.out.println("프로그램 정상 종료");
    }

}