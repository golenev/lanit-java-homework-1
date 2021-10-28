package model;

import java.lang.annotation.ElementType;
import java.util.ArrayList;

public class Application {




    public static void main(String[] args) {



Kotik kotik = new Kotik("Boris", 40, true);
        System.out.println("Создан объект Котик под номером - " + Kotik.counterObj());
        Kotik kotik1 = new Kotik("Barsik", 60, false);
        System.out.println("Создан объект Котик под номером - " + Kotik.counterObj());
kotik.liveAnotherDay();






    }
}
