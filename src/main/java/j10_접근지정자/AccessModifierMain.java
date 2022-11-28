package j10_접근지정자;

public class AccessModifierMain {
    public static void main(String[] args) {

        StudentAccessModifier sam = new StudentAccessModifier(20220001, "김준일");

        // sam.showInfo ->StudentAccessModifier class가 A Package 내부로 들어가니까 나타나지 않는다.

        sam.showInfo();
        sam.setName("김경민");
        sam.showInfo();

        System.out.println(sam.getCode());



    }

}
