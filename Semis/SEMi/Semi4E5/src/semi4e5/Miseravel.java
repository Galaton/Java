
package semi4e5;


public class Miseravel extends Pessoa {
    private int cachaca;
    
    public Miseravel(String nome,int idade,int cachaca){
        super(nome,idade);
        this.cachaca = cachaca;
    }
    public void mendiga(){
        cachaca ++;
    }
}
