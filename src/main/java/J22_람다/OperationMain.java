package J22_람다;

public class OperationMain {

    public static void main(String[] args) {

        int a = 10, b = 20;

        Operation add = new Operation(){

            @Override
            public int calc(int x , int y) {
                return x + y ;
            }
        };

        Operation add2 = (int x, int y) -> {
            return x + y ;
        };

        Operation sub = (x , y) -> x - y;

        System.out.println(sub.resultToString(sub.calc(b,a)));


        int addResult = add.calc(a,b);
        System.out.println(a+ "+" + b + "=" + addResult);

        int addResult2= add2.calc(a, b);
        System.out.println(a+ "+" + b + "=" + addResult2);

        Operation multi = (x,y) -> x * y;
        System.out.println(multi.resultToString(multi.calc(b,a)));

        Operation dvi = (x,y) -> x/y;
        System.out.println(dvi.resultToString(dvi.calc(b,a)));




    }
}
