package com.leya.demo.cp;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Warehouse {
	BlockingQueue<Product> queues = new LinkedBlockingQueue<Product>(10);

	public void push(Product p) throws InterruptedException {
		queues.put(p);
	}

	public Product pop() throws InterruptedException {
		return queues.take();
	}
}
