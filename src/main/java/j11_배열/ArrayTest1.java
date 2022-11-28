package j11_배열;

//배열 은 그냥 하나의 묶음으로 생각하면 된다.

public class ArrayTest1 {

    public static void main(String[] args) {
        int[] numArray = new int[10];  //new 동적할당  int 는 4byte
        // 즉 4byte 공간 10개를 묶음으로 만들어라. (0~9)
        //묶음의 주소 = numArray

        int index = 9;

        //numArray[0] = 10;  //index 번호 [] 로 접근을 하고 그 공간에 10을 넣음. 여기서 0은 변수명이 아니라 값임.

        numArray[index] = 10;  // index 9 번에 10을 넣어놨기 때문에 출력시에 마지막에 10이 나옴.

        for(int i = 0; i<10;i++){
            System.out.println(numArray[i]);
        }


    }

}
