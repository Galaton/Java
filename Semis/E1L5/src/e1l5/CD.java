
package e1l5;


public class CD extends Produto {
    private int faixas;
    
    public CD (String nome,float preco,int faixas){
        super(nome,preco);
        this.faixas = faixas;
    }
    @Override
    public String toString(){
        return super.toString()+"Faixas:"+faixas;
    }
}
