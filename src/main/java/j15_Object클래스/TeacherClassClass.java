package j15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherClassClass {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        Teacher teacher2 = new Teacher("김준일", "코리아아이티");

        Class t_class = teacher1.getClass();

        System.out.println(t_class.getSimpleName());
        System.out.println(t_class.getName());

        Field[] fields = t_class.getDeclaredFields();
        for(int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType());

        }

        Method[] method = t_class.getDeclaredMethods();
        for(int i = 0; i < method.length; i++) {
            System.out.println(method[i].getName());

        }

        System.out.println(teacher1.getClass()==teacher2.getClass()); //→ true
        System.out.println(teacher1 instanceof Teacher); // → true
        System.out.println(teacher1.getClass() ==Teacher.class); // → true
        System.out.println(teacher2.getClass() ==Teacher.class); // → true


    }
}
