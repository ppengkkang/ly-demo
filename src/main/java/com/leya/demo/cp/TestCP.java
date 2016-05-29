package com.leya.demo.cp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCP {

	public static void main(String[] args) {
		
		Warehouse w = new Warehouse();
		
        ExecutorService service = Executors.newCachedThreadPool();
        Producer p1 = new Producer("马国强", w);
        Producer p2 = new Producer("汪文虎", w);
        Producer p3 = new Producer("薛志强", w);
        Producer p4 = new Producer("刘莹", w);
        Consumer c1 = new Consumer("李德坤", w);
        Consumer c2 = new Consumer("吴志斌", w);
        Consumer c3 = new Consumer("魏臣", w);
        Consumer c4 = new Consumer("刘凯", w);
        service.submit(p1);
        service.submit(p2);
        service.submit(p3);
        service.submit(p4);
        service.submit(c1);
        service.submit(c2);
        service.submit(c3);
        service.submit(c4);

	}

}
