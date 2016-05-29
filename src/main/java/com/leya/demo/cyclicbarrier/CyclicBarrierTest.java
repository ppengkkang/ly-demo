/**
 * CyclicBarrierTest.java
 * Created at Dec 15, 2015
 * Created by Peng Yong
 * Copyright (C) 2015
 */
package com.leya.demo.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *  CyclicBarrierTest 
 *  Description:   
 *  Author: Peng Yong 
 *  Date: Dec 15, 2015 
 */
public class CyclicBarrierTest {

    /**
     *  Description:   
     * @param args
     */
    public static void main(String[] args) {
        //   Auto-generated method stub
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
        ExecutorService es = Executors.newFixedThreadPool(4);
        for(int i=1;i<=4;i++){
            es.submit(new ClubMember(i,cyclicBarrier));
        }
        es.shutdown();
        
        saveDefault:save1();
     
    }
    
    static void saveDefault(){
        System.out.println("saveDefault");
    }
    
    static void save(){
        System.out.println("save");
    }
    
    static void save1(){
        System.out.println("save1");

    }

}
