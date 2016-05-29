/**
 * ClubMember.java
 * Created at Dec 15, 2015
 * Created by Peng Yong
 * Copyright (C) 2015
 */
package com.leya.demo.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 *  ClubMember 
 *  Description:   
 *  Author: Peng Yong 
 *  Date: Dec 15, 2015 
 */
public class ClubMember implements Runnable{

    private int id;
    private CyclicBarrier cyclicBarrier;
    
    public ClubMember (int id, CyclicBarrier cyclicBarrier) {
        this.id = id;
        this.cyclicBarrier = cyclicBarrier;
    }
    

    /* (non-Javadoc)
     *  Title: run 
     *  Description:  
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        try {
            System.out.println("member "+ id +" 到了");
            cyclicBarrier.await();
            System.out.println("member "+ id +" 出发了");            
        } catch (InterruptedException | BrokenBarrierException e) {
            //   Auto-generated catch block
            e.printStackTrace();
        }
        
    }    
    
    
    /**
     *  Description:   
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     *  Description:   
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
