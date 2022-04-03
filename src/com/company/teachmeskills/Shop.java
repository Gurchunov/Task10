package com.company.teachmeskills;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> list = new ArrayList<>();

    public void add(Product product) {
        //я не понял как сделать сравнение по id
        list.add(product);
    }


    public void remove(int id) {
        list.removeIf(it -> (it.getId() == id));
    }

    public ArrayList<Product> getAll() {
        return list;
    }

    public void changeProduct(Product product, String name, int price ) {
        //и тут вроде чушь, но как смог ...)
       product.setName(name);
       product.setPrice(price);
    }
}
