package com.leya.demo.cp;

public class Producer implements Runnable{
	private String name;
    private Warehouse w = null;

    public Producer(String name, Warehouse w) {
        this.name = name;
        this.w = w;
    }

    public void run() {
        try {
            while (true) {
                Product product = new Product((int) (Math.random() * 1000000)); //
                System.out.println(name + "Ready to produce(" + product.toString() + ").");
                w.push(product);
                System.out.println(name + " produced (" + product.toString() + ").");
                System.out.println("===============");
                Thread.sleep(500);
            }
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

    }
}
