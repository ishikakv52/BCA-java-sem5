class MyTask implements Runnable {
    public void run(){
    System.out.println("Jaat");
    }
}

public class threadrunnable{
    public static void main(String[] args){
        MyTask task= new MyTask();
        Thread t=new Thread(task);
        t.start();
    }
}