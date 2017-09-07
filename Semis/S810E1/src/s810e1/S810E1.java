
package s810e1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class S810E1 {

    public static void main(String[] args) {
        Thread a = new Thread(0,10000);
        Thread b = new Thread(10001,20000);
        Thread c = new Thread(20001,30000);
        Thread d = new Thread(30001,40000);
        Thread e = new Thread(40001,50000);
        
        ExecutorService rrun = Executors.newCachedThreadPool();
        rrun.execute(a);
        rrun.execute(b);
        rrun.execute(c);
        rrun.execute(d);
        rrun.execute(e);
        rrun.shutdown();
    }
    
}
