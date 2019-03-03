package com.threads.stack;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {


    @Override
    public Thread newThread(Runnable r) {
        Thread t=new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
