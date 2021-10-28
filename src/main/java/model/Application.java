package model;

import java.lang.annotation.ElementType;
import java.util.ArrayList;

public class Application {


    public static void main(String[] args) {


        Kotik kotik = new Kotik("Boris", 40, true, "Meeeeeeeeeooow");
        System.out.println("Создан объект Котик под номером - " + Kotik.counterObj());
        System.out.println("Имя первого созданного кота " + kotik.getName());
        Kotik kotik1 = new Kotik("Barsik", 60, false, "Meeeoww");

        System.out.println("Создан объект Котик под номером - " + Kotik.counterObj());
        System.out.println("Имя второго созданного кота " + kotik1.getName());
        kotik.liveAnotherDay();
Kotik.equals(kotik, kotik1);

    }


}