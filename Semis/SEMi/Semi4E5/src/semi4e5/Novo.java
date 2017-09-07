package semi4e5;
public class Novo extends Imovel {
    private float adicional = (float) 0.2;
    
    public Novo(){
      
        preco =(float) preco +(preco*adicional);
    }
    public float getAdicional(){
        return adicional;
    }
}
