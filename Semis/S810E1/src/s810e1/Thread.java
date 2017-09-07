
package s810e1;


public class Thread implements Runnable {
    private int inicial,finale;    
    
    public Thread(int inicial,int finale){
        this.inicial = inicial;
        this.finale = finale;
    }
    
    public void run() {
        for(int i = inicial ;i<finale;i++ ){
            System.out.println("\n"+i);
        }
    }
    
}
