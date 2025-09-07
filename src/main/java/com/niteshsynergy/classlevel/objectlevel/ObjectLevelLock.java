

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        ObjectLevelExample objectLevelExample= new ObjectLevelExample();

        ObjectLevelExample objectLevelExample1= new ObjectLevelExample();

        Thread t1= new Thread(()->{
            objectLevelExample.updateValues("t1");
        });
        t1.start();
        Thread t2= new Thread(()->{
            objectLevelExample.updateValues("t2");
        });
        t2.start();
        Thread t3= new Thread(()->{
            objectLevelExample1.updateValues("t3");
        });
        t3.start();

    }

}
class ObjectLevelExample{
    int x;
    int y;
    int z;
    public synchronized int updateValues(String name){
        { x++;
            y++;
            z++;
            for(int i=0;i<10;i++)
                System.out.println("->"+name);
        }
        for(int i=0;i<10;i++){
            System.out.println(name+" : "+x+","+y+","+z);
        }
        return x+y+z;
    }
}

