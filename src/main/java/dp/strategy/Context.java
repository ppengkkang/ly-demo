/**
 * Context.java
 * Created at Feb 25, 2016
 * Created by Peng Yong
 * Copyright (C) 2016
 */
package dp.strategy;

/**
 *  Context 
 *  Description:   
 *  Author: Peng Yong 
 *  Date: Feb 25, 2016 
 */
public class Context {

    Algorithm alg;
    
    /**
     *  Description:   
     */
    public Context(Algorithm alg) {
        //   Auto-generated constructor stub
        this.alg = alg;
    }
    
    public void execute(){
        alg.caculate();
    }

}
