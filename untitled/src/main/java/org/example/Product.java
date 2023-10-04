package org.example;

public class Product {
    protected String name;
    protected String brand;
    protected Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        checkPrice(price);
    }

    public Product(){
        this("<Product>");
    }

    public Product(String name){
        this(name, 100.0);
    }

    public Product(String name, Double price){
        this("<Brand>,", name, price);
    }

    public Product(String brand, String name, double price) {
        checkBrand(brand);
        checkName(name);
        checkPrice(price);
    }

    private void checkName(String name) {
        if (name == null || name.length() < 3) {

            this.name = "<Product>";
        }
        else {
            this.name = name;
        }
    }

    private void checkPrice(Double price) {
        if (price < 100) {
            this.price = 100.0;
        } else {
            this.price = price;
        }
    }

    private void checkBrand(String brand) {
        if (brand == null || brand.length() < 3){
            this.brand = "<Brand>";
        }
        else {
            this.brand = brand;
        }
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f", brand, name, price);
    }
}
