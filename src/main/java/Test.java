import java.io.IOException;
import java.net.ServerSocket;

/**
 * Test.java
 * Created at Feb 27, 2016
 * Created by Peng Yong
 * Copyright (C) 2016
 */

/**
 *  Test 
 *  Description:   
 *  Author: Peng Yong 
 *  Date: Feb 27, 2016 
 */
public class Test {

    /**
     *  Description:   
     */
    public Test() {
        //   Auto-generated constructor stub
    }

    /**
     *  Description:   
     * @param args
     */
//    public static void main(String[] args) {
//        //   Auto-generated method stub
//        if(isSingleClient()){
//            System.out.println("X");
//        }
//
//        if(!isSingleClient()){
//            System.out.println("只能启动一个实例");
//            return;
//        }
//        
//        System.out.println("continue");
//
//    }
    

    
    private static boolean isSingleClient()
    {
        try
        {
            if (new ServerSocket(4701) != null)
            {
                return true;
            }
        }
        catch(IOException e)
        {
            //log.debug(e.getMessage());
        }
        
        return false;
    }

}
