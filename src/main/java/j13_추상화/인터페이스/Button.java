package j13_추상화.인터페이스;

public abstract class Button implements Press, Up, Down {  //press - 한 공간 내에서 한 동작으로 눌렀다 떼기, up - 다른공간에서 누르고 공간내에서 떼기, down - 공간내에서 꾹 누르고 있는거
//control + i 인터페이스 불러 오기

    @Override
    public void onDown() {}

    @Override
    public void onPressd() {}

    @Override
    public void onUp() {}
}
