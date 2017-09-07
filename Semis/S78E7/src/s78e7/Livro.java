
package s78e7;


public class Livro {
    private String titulo;
    private int paginas;
    
    public Livro(String titulo,int paginas){
        this.titulo = titulo;
        this.paginas = paginas;
        
    }
    public String getTitulo(){
        return titulo;
    }
    public int getPaginas(){
      return paginas;  
    }
}
