
package semi4e5;
public class Vip extends Ingresso{
    
    private float extra;
    
    public Vip(float valor, float extra){
        super (valor);
      this.extra = extra;
        this.valor = valor + extra; 
    }
    @Override
    public float imprimeValor(){

        return (valor);
        
    }
}
