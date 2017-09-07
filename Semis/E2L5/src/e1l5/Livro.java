
package e1l5;


public class Livro extends Produto{
    private String autor;
    
    
    public Livro(String nome, String autor,float preco,int codigoDeBarras){
        
        super(nome,preco, codigoDeBarras);
        this.autor = autor;
        
    }
    @Override
    public String toString(){
       return super.toString() + " Autor:" + autor;
    }
}
