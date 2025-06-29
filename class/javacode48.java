import java.util.*;

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread running");
    }
}


public class javacode48{
    public static void main(String args[]){
        MyThread t = new MyThread();
        t.start();
    }
}