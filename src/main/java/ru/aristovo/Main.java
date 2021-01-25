package ru.aristovo;

import ru.aristovo.box.Gift;
import ru.aristovo.sweets.*;

public class Main {

    public static void main(String[] args) {

        Gift gift = new Gift();
        gift.addSweet(new Candy("Твикс", 0.025, 70.50, "Печенье и нуга"));
        gift.viewSweet();
        System.out.println("------------------");

        gift.addSweet(new Cookies("Овсяное", 0.37, 50.15,"С орехом"));
        gift.viewSweet();
        System.out.println("------------------");

        gift.addSweet(new Waffle("Венские", 0.60, 32.5, "Со сливками"));
        gift.viewSweet();
        System.out.println("------------------");

        gift.addSweet(new Gingerbread("Медовые", 0.45, 45.11, "С джемом"));
        gift.viewSweet();
        System.out.println("------------------");

        gift.addSweet(new Marmalade("Мармелад", 0.34, 43.6, "С джемом"));
        gift.addSweet(new Marmalade("Мармелад", 0.34, 43.6, "С джемом"));
        gift.addSweet(new Marmalade("Мармелад", 0.34, 43.6, "С джемом"));
        gift.addSweet(new Marmalade("Мармелад", 0.34, 43.6, "С джемом"));
        gift.addSweet(new Gingerbread("Медовые", 0.45, 45.11, "С джемом"));
        gift.viewSweet();
        System.out.println("------------------");

    }

}
