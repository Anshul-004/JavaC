class th1 extends Thread{
    public void run()
    {
        while (true)
        {
            System.out.println("Thread 1 running");
        }
    }
}

class th2 extends Thread{
    public void run()
    {
        while (true)
        {
            System.out.println("Thread 2 running");
        }
    }
}


public class mtlith {
    public static void main(String[] args) {
        // th1 t1 = new th1();
        // th2 t2 = new th2();

        //thoda thoda time dono thread chalega !

        // t1.start();
        // t2.start(); 
        //normally .run() krke chalate toh, ek ek krke run hota
    }
}
