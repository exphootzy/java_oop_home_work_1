package org.example;

public class HotDrink extends Product {

    private int temperature;
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrink(String brand, String name, int volume, int temperature,double price) {
        super(brand, name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[HOT DRINK] %s - %s - %d ml - %d degree - %.2f rub", brand, name, volume, temperature, price);
    }
}