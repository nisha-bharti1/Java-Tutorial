import java.util.*;

class Myrunnable implements Runnable{
    public void run(){
        System.out.println("Thread running");
    }
}


public class javacode49{
    public static void main(String args[]){
        Thread t = new Thread(new Myrunnable());
        t.start();
    }
}