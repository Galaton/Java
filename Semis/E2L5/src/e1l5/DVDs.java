
package e1l5;


public class DVDs extends Produto{
    
    public float duracao;
    
    public DVDs(String nome,float preco,float duracao,int codigoDeBarras){
        super(nome,preco,codigoDeBarras);
        this.duracao = duracao;
    }
    @Override
    public String toString(){
        return super.toString() + " Duracao:"+duracao;
    }
}
