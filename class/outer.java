import java.util.*;

class outer{
    int x = 10;

    class inner{
        void show(){
            System.out.println("x = " + x);
        }
    } 

    public static void main(String args[]){

        outer out = new outer();
        outer.inner in = out.new inner();

        in.show();

    }
}
