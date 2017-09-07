package semi4e5;
public class Velho extends Imovel {
    private float desconto =(float) 0.8;
    
    public Velho(){
        preco =(float) preco * desconto;
    }
    public float getDesconto(){
        return desconto;
    }
    
}
