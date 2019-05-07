package org.tyaa.java.testing.junit.syncthreads;

public class Main {

    public static Data d;
    public static MyThread t1;
    public static MyThread t2;
    
    public static void main(String[] args) throws InterruptedException
    {
        d = new Data();
        t1 = new MyThread(d);
        t2 = new MyThread(d);
        Thread.sleep(3000);

        // System.out.println(d.count);
        // System.out.println(Data.countSt);
    }
}

class Data
{
    int count =0;
    static int countSt =0;
}

class MyThread implements Runnable {
  
    Data obj;
    
    MyThread(Data d){
        obj = d;
        new Thread(this).start();
    }
    
    //TODO: синхронизировать работу обоих методов с полями count и countSt
    
    void Add(){
        try {
            Thread.sleep(10);
            synchronized(obj){
                int n=obj.count;
                n++;
                Thread.sleep(10);
                obj.count=n;
            }
        } catch (InterruptedException ex) {       }
    }
    synchronized static void AddStatic() {
        try {
            Thread.sleep(10);
            int n=Data.countSt;
            n++;
            Thread.sleep(10);
            Data.countSt=n;
        } catch (InterruptedException ex) {       }
    }
    public void run() {
        for(int i=0; i<10; i++) Add();
        for(int i=0; i<10; i++) AddStatic();
    }
}
