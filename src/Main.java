public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper =  763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("\n");
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog += 4;
        var cat = 3.6;
        cat += 4;
        var paper =  763789;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("\n");

    }

    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog -= 3.5;
        var cat = 3.6;
        cat -= 1.6;
        var paper =  763789;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("\n");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        System.out.println("\n");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        System.out.println("\n");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        System.out.println("Вес первого боксера: " + boxer1);
        var boxer2 = 82.7;
        System.out.println("Вес второго боксера: " + boxer2);
        System.out.println("Общий вес бойцов: " + (boxer1 + boxer2));
        System.out.println("Разница веса бойцов: " + (boxer2 - boxer1));

        System.out.println("\n");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxer1 = 78.2;
        System.out.println("Вес первого боксера: " + boxer1);
        var boxer2 = 82.7;
        System.out.println("Вес второго боксера: " + boxer2);
        System.out.println("Разница веса бойцов(метод вычитания): " + (boxer2 - boxer1));
        System.out.println("Разница веса бойцов(метод остатка от деления): " + (boxer2 % boxer1));

        System.out.println("\n");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var hours = 640;
        var wrkHours = 8;
        var working = hours/wrkHours;
        System.out.println("Всего работников в компании — " + working + " человек");
        working += 94;
        wrkHours = hours/working;
        System.out.println("Если в компании работает " + working + " человек, " +
                "то всего " + wrkHours + " часа работы может быть поделено между сотрудниками");
    }

}