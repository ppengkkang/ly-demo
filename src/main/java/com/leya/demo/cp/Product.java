package com.leya.demo.cp;

public class Product {
    private int id;

    public Product(int id) {
        this.id = id;
    }

    public String toString() {
        return "Product：" + this.id;
    }
}
