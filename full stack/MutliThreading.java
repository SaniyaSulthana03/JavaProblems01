public class MutliThreading {
    public static void main(String[] args)
    {
        One one = new One();
        Two two = new Two();
        System.out.println("bye");
        // one.show();
        // two.show();
        one.start();
        two.start();
        try{
                Thread.sleep(500);

            }
            catch(Exception e){}
            try{
                one.join();
            }
            catch(Exception e){}
            System.out.println("hello");

    }
}

class One extends Thread{
    public void run(){
        for(int i = 0; i <5; i++)
        {
            System.out.println("java programming");
            try{
                Thread.sleep(500);

            }
            catch(Exception e){}
            // Thread.sleep(500);
        }
    }

}
class Two extends Thread{

     public void run(){
        for(int i = 0; i <5; i++)
        {
            System.out.println("java programming language");
        }
    }
}


