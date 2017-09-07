
package semi4e5;


public class Pobre extends Pessoa {
    public int felicidade;
    public Pobre(String nome,int idade, int felicidade){
        super(nome,idade);
        this.felicidade = felicidade;
    }
    
    public void trabalha(){
    felicidade --;    
    }
}
