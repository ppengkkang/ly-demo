package com.leya.demo.mthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Callable;

/**
 * 
 *  MPrinter1 
 *  Description: Lock类, Excutor框架使用 
 *  Author: Peng Yong 
 *  Date: Oct 17, 2015
 */
public class MPrinter1 {
    
    //Callable/Runnable
	
	public static class PrintTask implements Runnable{
		
		Lock lock = new ReentrantLock();
		
		private String content;
		
		public PrintTask(String content){
			this.content = content;
		}
		
		public void print(){
			lock.lock();
			System.out.println(content);
			lock.unlock();
		}

		@Override
		public void run() {
			print();			
		}
		
	}
	
	
	public static void main(String[] args) throws Exception{
		PrintTask printTaskA = new PrintTask("A");
		PrintTask printTaskB = new PrintTask("B");
		PrintTask printTaskC = new PrintTask("C");

		ExecutorService excutorService = Executors.newCachedThreadPool();
		Future future = null;
		int c = 5;
		while(c>0){
			future = excutorService.submit(printTaskA);
			future.get();
			future = excutorService.submit(printTaskB);
			future.get();
			future = excutorService.submit(printTaskC);
			//
			//
			//
			//
			Object b = future.get();
			//
			
			c--;
		}
		excutorService.shutdown();
	}
	
}
