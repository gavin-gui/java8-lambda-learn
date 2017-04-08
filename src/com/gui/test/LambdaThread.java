package com.gui.test;

/**
 * Created by gui on 2017/4/8.
 */
public class LambdaThread {

    public static void main(String[] args){
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(System.currentTimeMillis());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
