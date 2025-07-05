import java.util.*;

class outer{
    static int x = 10;

    static class inner{
        void show(){
            System.out.println("x = " + x);
        }
    } 
}

public class javacode52{
    public static void main(String args[]){

        outer.inner in = new outer.inner();

        in.show();

    }
}
