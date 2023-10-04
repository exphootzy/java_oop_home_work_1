package org.example;

import java.util.List;

public class HotDrinksMachine
{
    private List<Product> products2;

    public HotDrinksMachine(List<Product> products2) {
        this.products2 = products2;
    }

    public HotDrink getHotDrink (String name, double volume, int temperature) {
        for (Product product : products2){
            if (product instanceof HotDrink){
                HotDrink hotdrink = (HotDrink) product;
                if (hotdrink.getTemperature() == temperature && hotdrink.getName() == name && hotdrink.getVolume() == volume) {
                    return hotdrink;
                }
            }
        }
        return null;
    }
}