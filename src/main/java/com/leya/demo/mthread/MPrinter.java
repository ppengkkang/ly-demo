package com.leya.demo.mthread;

/**
 * 
 *  MPrinter 
 *  Description: 多线程wait(),notify()
 *  Author: Peng Yong 
 *  Date: Oct 17, 2015
 */
public class MPrinter implements Runnable {

	private String conetent;
	private Object previousLock;
	private Object currentLock;

	public static void main(String[] args) throws Exception{
		Object aLock = new Object();
		Object bLock = new Object();
		Object cLock = new Object();
		
		MPrinter p1 = new MPrinter("1", cLock, aLock);
		MPrinter p2 = new MPrinter("2", aLock, bLock);     
		MPrinter p3 = new MPrinter("3", bLock, cLock);  
		
		new Thread(p1).start();
		Thread.sleep(1000);
		new Thread(p2).start();
		Thread.sleep(1000);
		new Thread(p3).start();
		Thread.sleep(1000);
	}

	public MPrinter(String conetent, Object previousLock, Object currentLock) {
		this.conetent = conetent;
		this.previousLock = previousLock;
		this.currentLock = currentLock;
	}

	@Override
	public void run() {
		int c = 5;
		while (c>0) {
			synchronized (previousLock) {
				synchronized (currentLock) {
					System.out.println(conetent);
					c--;
					currentLock.notify();
				}
				try {
					previousLock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
