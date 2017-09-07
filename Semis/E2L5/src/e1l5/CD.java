
package e1l5;


public class CD extends Produto {
    private int faixas;
    
    public CD (String nome,float preco,int faixas,int codigoDeBarras){
        super(nome,preco,codigoDeBarras);
        this.faixas = faixas;
    }
    @Override
    public String toString(){
        return super.toString()+"Faixas:"+faixas;
    }
}
