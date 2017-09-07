
package semi4e5;


public class Animal {
    protected String nome;
    private String raca;
    private int v[];
    
    public Animal(){
        v = new int[2];
        v[0]=0;
        v[1]=0;
    }
    public Animal(String nome){
        this.nome= nome;
        v = new int[2];
        v[0]=0;
        v[1]=0;
    }
    public void caminha(){
        v[0]++;
    }
    
}
