package ru.aristovo.box;

import ru.aristovo.sweets.Sweets;

public class Gift implements SweetBox {

    private Sweets[] sweetsInGift;

    @Override
    public void addSweet(Sweets sweet) {
        if (sweetsInGift == null) {
            sweetsInGift = new Sweets[1];
            sweetsInGift[0] = sweet;
        } else {
            Sweets[] sw = new Sweets[sweetsInGift.length + 1];
            for (int i = 0; i < sw.length; i++) {
                if (i != sw.length-1) {
                    sw[i] = sweetsInGift[i];
                } else {
                    sw[i] = sweet;
                }
            }
            sweetsInGift = sw;
        }
    }

    @Override
    public void removeSweet(int index) {
        if (index < sweetsInGift.length) {
            Sweets[] sw = new Sweets[sweetsInGift.length - 1];
            for (int i = 0; i < sw.length; i++) {
                if (i >= index) {
                    sw[i] = sweetsInGift[i+1];
                } else {
                    sw[i] = sweetsInGift[i];
                }
            }
            sweetsInGift = sw;


        } else {
            System.out.println("Нет такой позиции в коробке");
        }
    }

    @Override
    public void calcWeightBox() {
        double weightBox = 0;
        for (Sweets sw : sweetsInGift) {
            weightBox += sw.getWeight();
        }
        System.out.println("Вес коробки = " + weightBox + " кг.");
    }

    @Override
    public double calcWeightBoxRet() {
        double weightBox = 0;
        for (Sweets sw : sweetsInGift) {
            weightBox += sw.getWeight();
        }
        return weightBox;
    }

    @Override
    public void calcPriceBox() {
        double priceBox = 0;
        for (Sweets sw : sweetsInGift) {
            priceBox += sw.getWeight() * sw.getPrice();
        }
        System.out.println("Цена подарочной коробки = " + String.format("%.2f", priceBox) + " руб.");
    }

    @Override
    public void viewSweet() {
        System.out.println("В коробке содержится:");
        for (Sweets sw : sweetsInGift) {
            System.out.println(sw);
        }
    }

    @Override
    public void minByWeight(double maxWeight) {
        while (calcWeightBoxRet() > maxWeight) {
            int index = 0;
            double minWeight = sweetsInGift[0].getWeight();
            for (int i = 0; i < sweetsInGift.length; i++) {
                if (minWeight > sweetsInGift[i].getWeight()) {
                    minWeight = sweetsInGift[i].getWeight();
                    index = i;
                }
            }
            removeSweet(index);
        }
    }
}
