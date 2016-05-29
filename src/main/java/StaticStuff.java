/**
 * StaticStuff.java
 * Created at Apr 14, 2016
 * Created by Peng Yong
 * Copyright (C) 2016
 */

/**
 * StaticStuff Description: Author: Peng Yong Date: Apr 14, 2016
 */
class StaticStuff {
    static int x = 10;
    static {
        x += 5;
    }

    public static void main(String args[]) {
        System.out.println("x=" + x);
    }

    static {
        x /= 3;
    }
}
