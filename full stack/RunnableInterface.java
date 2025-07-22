public class RunnableInterface {
    public static void main(String[] args) {
        Runnable obj1=new One();
        Runnable obj2=new Two();

        Thread t1 =new Thread(obj1);
        Thread t2 =new Thread(obj2);
        try{t1.join();}catch(Exception e){}
        try{t2.join();}catch(Exception e){}
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(10);
        t2.setPriority(1);
        t1.setName("test");
        t2.setName("testimony");

        t1.start();
        t2.start();

    
}
}
class One implements Runnable {
    public void run() {
        for (int i = 0; i < 5;i++) {
            System.out.println("c programming");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class Two implements Runnable 
{
    public void run()
     {
        for (int i = 0; i < 5;i++)
         {
            System.out.println("c programming");
            try 
            {
                Thread.sleep(1000);
            } catch (Exception e) 
            {
                System.out.println(e);
            }
        }
    }
}

//if same resource is used by two or more processors or threads then system will become unstable.
//thread synchronization we keep our safe state
//arraylist,linkedlist and stack,vector.
// one resource is used byonly one thread


