package com.leya.demo.cp;

public class Consumer implements Runnable {
	private String name;
    private Warehouse w = null;

    public Consumer(String name, Warehouse w) {
        this.name = name;
        this.w = w;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(name + "Ready to consume...");
                Product product = w.pop();
                System.out.println(name + " Consumed (" + product.toString() + ").");
                System.out.println("===============");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
