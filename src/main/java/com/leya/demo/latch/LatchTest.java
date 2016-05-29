/**
 * LatchTest.java
 * Created at Nov 5, 2015
 * Created by Peng Yong
 * Copyright (C) 2015
 */
package com.leya.demo.latch;

import java.util.concurrent.CountDownLatch;

/**
 *  LatchTest 
 *  Description:   
 *  Author: Peng Yong 
 *  Date: Nov 5, 2015 
 */
public class LatchTest {

    /**
     *  Description:   
     * @param args
     */
    public static void main(String[] args) {
        //   Auto-generated method stub
        final CountDownLatch countDown = new CountDownLatch(5);
        
        new Thread(){
            public void run(){
                System.out.println("活干完了1");
                countDown.countDown();
                
            }
        }.start();
        
        new Thread(){
            public void run(){
                System.out.println("活干完了2");
                countDown.countDown();
                
            }
        }.start();
        
        new Thread(){
            public void run(){
                System.out.println("活干完了3");
                countDown.countDown();
                
            }
        }.start();
        
        new Thread(){
            public void run(){
                System.out.println("活干完了4");
                countDown.countDown();
                
            }
        }.start();
        
        new Thread(){
            public void run(){
                System.out.println("活干完了5");
                countDown.countDown();
                
                
            }
        }.start();
        
        try {
            countDown.await();
            System.out.println("活都干完了");
        } catch (InterruptedException e) {
            //   Auto-generated catch block
            e.printStackTrace();
        }      
    }

}
