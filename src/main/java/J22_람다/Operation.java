package J22_람다;

@FunctionalInterface //람다는 달아놓는다. 추상 메소드를 두개를 할수 없게끔
public interface Operation {

    public int calc(int x, int y);
    //public int calc2(int x, int y); 주석 해제 하면 functionalInterface 에 빨간줄 생김

    public default String resultToString(int result){
        return "결과 : " + result;
    }


}
