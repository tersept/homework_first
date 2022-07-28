package guru.qa;

import java.util.Scanner;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    void speak(){System.out.println("Я мяукаю");
    }

    void sayAge (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст вашего питомца в месяцах:");
        double year = sc.nextDouble();
        if (year<13) System.out.println("Он ещё котенок");
        if (year>=13 && year<=240) System.out.println("Он уже взрослый");
        if (year>240) System.out.println("Столько коты не живут(");
    }
}
