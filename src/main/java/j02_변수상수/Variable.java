package j02_변수상수;


/*변수*/

public class Variable {
    //var 변수임
    public static void main(String[] args) {
        //논리자료형 변수
        boolean checkFlag = false;  //선언 및 초기화
        System.out.println(checkFlag);  //sout 하면 바로 나옴
        checkFlag = true;
        System.out.println(checkFlag);

        //문자 자료형 변수
        char name1 = '김';
        char name2 = '경';
        char name3 = '민';
        //char 는 유니코드로 자료저장
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        // System.out.println(name1+name2+name3); 출력 안됨. 숫자로 출력됨
        System.out.println(name1+name2+name3);
        System.out.println(""+name1+name2+name3);  // 이름이 합쳐져서 출력 , ""과 '+' 함으로써 문자열로 바뀜
        System.out.println('가'+0);

        int a = '가' + 0;
        System.out.println(Integer.toHexString(a));  //16진수 표기

        //문자열 자료형 변수  , 문자열 합칠때 '+' 연산자 사용
        String name = "김경민";
        String name4 = "김준일";
        String name5 = name + name4;
        System.out.println(name5);

        //정수 자료형 변수
        int width = 100;
        int width2 = 200;

        String width3 = "300";
        String width4 = "400";

        int widthResult = width + width2;  // 단순 수학계산
        String widthResult2 = width3 + width4;  // 문자열 배열이 일어남

        System.out.println(widthResult);
        System.out.println(widthResult2);

        long time = System.currentTimeMillis();  // 현재시간 표시
        System.out.println(time);


        //int time2 = 1666178937274;  int 는 21억 까지 사용 1666178937274 이거는 21억을 훨씬 오바
        long time2 = 1666178937274L;  //long 은 더 많이 사용가능 + 끝에 L 또는 ㅣ 붙여준다
        System.out.println(time2);

        //실수 자료형 변수
        double pi = 3.141592653599999999999; //소수점 뒤로 너무 길어지면 반올림이 일어남.  정수부분 계속 늘려도 이상하게 나옴 ex) E7 : 10^7이라는 말
        System.out.println(pi);


        // 상수, 상수 선언시에는 전부 대문자 라는 약속.
        final String FILE_PATH = "C:/Users/junil";
        //FILE_PATH = "D:/Users/aaa";
        System.out.println(FILE_PATH);





    }

}
