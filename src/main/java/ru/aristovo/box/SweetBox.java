package ru.aristovo.box;

import ru.aristovo.sweets.Sweets;

public interface SweetBox {

    //метод добавляет сладость в коробку
    public void addSweet(Sweets sweet);
    //public void addSweet(Sweets sweet, int quantity);

    //метод удаляет сладость из коробки по индексу
    public void removeSweet(int index);

    //метод выводит вес коробки


    //метод выводит стоимость коробки


    //метод выводит информацию о сладостях, находящихся в коробке
    public void viewSweet();

    //метод удаляет сладость с наименьшим весом, если вес коробки превышает входящий (заявленный)


    //метод удаляет сладость с наименьшей ценой, если вес коробки превышает входящий (заявленный)


}
