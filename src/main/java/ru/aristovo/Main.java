package ru.aristovo;

import ru.aristovo.box.Gift;
import ru.aristovo.sweets.*;

public class Main {

    public static void main(String[] args) {

        Gift gift = new Gift();
        System.out.println("-----------------Добавляем в коробку сладости-----------------");
        gift.addSweet(new Candy("Твикс0", 0.025, 70.50, "Печенье и нуга"));
        gift.addSweet(new Waffle("Венские1", 0.060, 32.5, "Со сливками"));
        gift.addSweet(new Cookies("Овсяное2", 0.037, 50.15,"С орехом"));
        gift.addSweet(new Marmalade("Червячки3", 0.015, 50.0, "С суфле"));
        gift.addSweet(new Gingerbread("Медовые4", 0.045, 45.11, "С джемом"));
        gift.addSweet(new Candy("Гуливер5", 0.05, 50.00, "Вафли"));
        gift.addSweet(new Waffle("Обычные6", 0.031, 29.0, "С шоколадом"));
        gift.addSweet(new Candy("Карамель7", 0.01, 24.99, "Клубника со сливками"));
        gift.addSweet(new Marmalade("Мармелад8", 0.034, 43.6, "С джемом"));
        gift.addSweet(new Gingerbread("Мятные9", 0.040, 33.3, "Без наполнителя"));
        gift.addSweet(new Cookies("Овсяное10", 0.032, 45.00,"С шоколадной крошкой"));
        gift.addSweet(new Gingerbread("Клубничные11", 0.051, 60.14, "С кокосовой стружкой"));
        gift.addSweet(new Waffle("Венские12", 0.055, 35.1, "Со сгущенкой"));
        gift.addSweet(new Marmalade("Мармелад13", 0.023, 35.35, "С сахаром"));
        gift.addSweet(new Cookies("Юбилейное14", 0.029, 26.90,"В шоколаде"));
        gift.viewSweet();

        //Раскомментировать следующий блок комментариев, чтобы протестировать удаление сладостей из коробки
        /*
        gift.removeSweet(10);//должен удалиться Овсяное10
        gift.removeSweet(10);//должен удалиться Клубничные11, т.к. оно теперь на 10 позиции в массиве
        gift.removeSweet(5);//должен удалиться Гуливер5
        gift.viewSweet();

        System.out.println("-----------------Удаление позиции, которой нет в массиве-----------------");
        gift.removeSweet(20);//ничего не удалиться, т.к. нет такого индекса, будет сообщение "Нет такой позиции в коробке"
        */

        System.out.println("-----------------Расчет веса коробки-----------------");
        gift.calcWeightBox();

        System.out.println("-----------------Расчет стоимости коробки-----------------");
        gift.calcPriceBox();

        System.out.println("-----------------Удаляем по минимальному весу-----------------");
        //В следующем методе ввести свою сумму для тестирования
        gift.minByWeight(0.500);
        gift.calcWeightBox();
        gift.viewSweet();

        System.out.println("-----------------Удаляем по минимальной цене-----------------");
        gift.minByPrice(0.450);
        gift.calcWeightBox();
        gift.viewSweet();
    }

}
