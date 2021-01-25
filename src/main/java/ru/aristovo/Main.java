package ru.aristovo;

import ru.aristovo.sweets.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Тестируем класс конфет");
        Sweets sweet1 = new Candy("Твикс", 0.025, 70.50, "Печенье и нуга");
        Sweets sweet2 = new Candy("Гуливер", 0.05, 50.00, "Вафли");
        Sweets sweet3 = new Candy("Карамель", 0.01, 24.99, "Клубника со сливками");

        System.out.println(sweet1);
        System.out.println(sweet2);
        System.out.println(sweet3);
        System.out.println("------------------------");

        System.out.println("Тестируем класс печений");
        Sweets sweet4 = new Cookies("Овсяное", 0.37, 50.15,"С орехом");
        Sweets sweet5 = new Cookies("Овсяное", 0.32, 45.00,"С шоколадной крошкой");
        Sweets sweet6 = new Cookies("Юбилейное", 0.29, 26.90,"В шоколаде");

        System.out.println(sweet4);
        System.out.println(sweet5);
        System.out.println(sweet6);
        System.out.println("------------------------");

        System.out.println("Тестируем класс вафлей");
        Sweets sweet7 = new Waffle("Венские", 0.60, 32.5, "Со сливками");
        Sweets sweet8 = new Waffle("Венские", 0.55, 35.1, "Со сгущенкой");
        Sweets sweet9 = new Waffle("Обычные", 0.31, 29.0, "С шоколадом");

        System.out.println(sweet7);
        System.out.println(sweet8);
        System.out.println(sweet9);
        System.out.println("------------------------");

        System.out.println("Тестируем класс пряников");
        Sweets sweet10 = new Gingerbread("Медовые", 0.45, 45.11, "С джемом");
        Sweets sweet11 = new Gingerbread("Мятные", 0.40, 33.3, "Без наполнителя");
        Sweets sweet12 = new Gingerbread("Клубничные", 0.51, 60.14, "С кокосовой стружкой");

        System.out.println(sweet10);
        System.out.println(sweet11);
        System.out.println(sweet12);
        System.out.println("------------------------");

        System.out.println("Тестируем класс мармелада");
        Sweets sweet13 = new Marmalade("Мармелад", 0.23, 35.35, "С сахаром");
        Sweets sweet14 = new Marmalade("Мармелад", 0.34, 43.6, "С джемом");
        Sweets sweet15 = new Marmalade("Червячки", 0.15, 50.0, "С суфле");

        System.out.println(sweet13);
        System.out.println(sweet14);
        System.out.println(sweet15);
        System.out.println("------------------------");
    }

}
