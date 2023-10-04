package org.example;


public class Programm {
    public static void main(String[] args) {
        Product product1 = new Product("WATERAQUA", "Bottle of water ONE", 200);

        ArrayList<Product> products2 = new ArrayList<>();
        HotDrinksMachine drinksMachine = new HotDrinksMachine(products2);


        Product tea1 = new HotDrink("Nestea", "Winter tea (1)", 400, 60, 300);
        System.out.println(tea1.displayInfo());

        Product coffee1 = new HotDrink("Nescaffe", "Cappuchino",200, 50, 350);
        System.out.println(coffee1.displayInfo());

        Product coffee2 = new HotDrink("Nescaffe", "Americano", 300, 65, 270);
        System.out.println(coffee2.displayInfo());

        Product coffee3 = new HotDrink("Nescaffe", "Espresso", 100, 60, 250);
        System.out.println(coffee3.displayInfo());


        products2.add(tea1);
        products2.add(coffee1);
        products2.add(coffee2);
        products2.add(coffee3);

        HotDrink hotDrink = drinksMachine.getHotDrink("Americano", 300, 65);
        if (hotDrink == null){
            System.out.println("There is no such drink");
        }
        else {
            System.out.println("You bought:");
            System.out.println(hotDrink.displayInfo());
    }
}