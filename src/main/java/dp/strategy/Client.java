/**
 * Client.java
 * Created at Feb 25, 2016
 * Created by Peng Yong
 * Copyright (C) 2016
 */
package dp.strategy;

/**
 *  Client 
 *  Description:   
 *  Author: Peng Yong 
 *  Date: Feb 25, 2016 
 */
public class Client {

    /**
     *  Description:   
     */
    public Client() {
        //   Auto-generated constructor stub
    }

    /**
     *  Description:   
     * @param args
     */
    public static void main(String[] args) {
        //   Auto-generated method stub
        AlgorithmSimple alg = new AlgorithmSimple();
        Context context = new Context(alg);
        context.execute();
    }

}
