package ru.aristovo.sweets;

public abstract class Sweets {

    protected String name;      //название сладости
    protected double weight;    //вес, кг
    protected double price;     //цена, руб/кг
    protected String filler;    //добавка, начинка, наполнитель и прочее

    // конструктор для создания сладости
    public Sweets (String name, double weight, double price, String filler) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.filler = filler;
    }

    //добавлены геттеры
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }
    public String getFiller() {
        return filler;
    }

    //переопределили вывод на экран информации и сладости
    @Override
    public String toString() {
        return "Наименование: " + getName() +
                "\tВес: " + getWeight() +
                "\tЦена: " + getPrice() +
                "\tДобавка: " + getFiller();
    }

}
