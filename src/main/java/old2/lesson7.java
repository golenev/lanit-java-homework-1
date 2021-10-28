package old2;




import java.util.Scanner;

public class lesson7 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[3];
        allCats[0] = new Cat("Boris", 500, false);
        allCats[1] = new Cat("Trump", 30, false);
        allCats[2] = new Cat("Murka", 10, false);


        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].appetite < plate.food) {
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Котик " + allCats[i].name + " покушал!");
            } else {
                System.out.println("Котику " + allCats[i].name + " не хватило еды!");
            }
        }
        plate.info();
        System.out.println("Сколько еды добавить еще в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
        


    }
}