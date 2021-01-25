package ru.aristovo;

import ru.aristovo.box.Gift;
import ru.aristovo.sweets.*;

public class Main {

    public static void main(String[] args) {

        Gift gift = new Gift();
        System.out.println("-----------------Добавляем в коробку сладости-----------------");
        gift.addSweet(new Candy("Твикс", 0.025, 70.50, "Печенье и нуга"));
        gift.addSweet(new Cookies("Овсяное", 0.37, 50.15,"С орехом"));
        gift.addSweet(new Gingerbread("Медовые", 0.45, 45.11, "С джемом"));
        gift.addSweet(new Marmalade("Мармелад", 0.23, 35.35, "С сахаром"));
        gift.calcWeightBox();


    }

}
