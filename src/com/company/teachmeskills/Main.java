package com.company.teachmeskills;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Product[] arr = new Product[3];

        Product pear = new Product(1, "груши", 15);
        Product apples = new Product(2, "яблоки", 3);
        Product oranges = new Product(3, "апельсины", 2);
        shop.add(pear);
        shop.add(apples);
        shop.add(oranges);


        ArrayList<Product> products = shop.getAll();
        System.out.println(shop.getAll());
        products.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Product) o1).getPrice() - ((Product) o2).getPrice();
            }
        });
        System.out.println(shop.getAll());
        shop.remove(1);
        System.out.println(shop.getAll());

        products.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Product) o1).getId() - ((Product) o2).getId();
            }
        });
        System.out.println(shop.getAll());
        shop.changeProduct(apples, "финики", 6);
        System.out.println(shop.getAll());
    }
}
