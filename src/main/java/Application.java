import model.Kotik;

import java.lang.annotation.ElementType;
import java.util.ArrayList;

public class Application {


    public static void main(String[] args) {


        Kotik kotik = new Kotik("Boris", 15, "Meeeeeeeeeooow");
        System.out.println("Создан объект Котик под номером - " + Kotik.counterObj());
        System.out.println("Имя первого созданного кота " + kotik.getName());
        Kotik kotik1 = new Kotik("Barsik", 60, "Meeeoww");

        System.out.println("Создан объект Котик под номером - " + Kotik.counterObj());
        System.out.println("Имя второго созданного кота " + kotik1.getName());
        System.out.println();//для пробела в консоли
        kotik.liveAnotherDay();
        System.out.println(); //для пробела в консоли
        Kotik.equals(kotik, kotik1);
    }
}