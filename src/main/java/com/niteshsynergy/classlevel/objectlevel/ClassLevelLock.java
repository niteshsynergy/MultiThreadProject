package com.niteshsynergy.classlevel.objectlevel;

public class ClassLevelLock {
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            ClassLevelExample.updatValues("t1");
        });
        t1.start();
        Thread t2 = new Thread(()->{
            ClassLevelExample.updatValues("t2");
        });
        t2.start();
        Thread t3 = new Thread(()->{
            ClassLevelExample.updatValues("t3");
        });
        t3.start();
    }
}

class ClassLevelExample{
    static int x;
    static int y;
    static int z;

    public static synchronized  int updatValues(String name){
        x++;y++;z++;
        for(int i=0;i<10;i++)
            System.out.println("name: "+name);
        for(int i=0;i<10;i++)
            System.out.println("Valuf of x,y,z"+x+" :"+y+" :"+z);
        return x+y+z;
    }
}
