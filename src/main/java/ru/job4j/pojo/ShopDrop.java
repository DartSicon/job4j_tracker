package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        products[index] = null;

        for (int i = index; i < products.length - 1; i++) {
            Product prod = products[i];
            products[i] = products[i + 1];
            products[i + 1] = prod;
        }

        return products;
    }
}