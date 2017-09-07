
package e4l5;


public class Retangulo extends Quadrilatero implements FormaGeometrica {
    
    private float base,altura;
    
    public Retangulo(float base, float altura){
        super(base,base,altura,altura);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public float calcArea(){
        
       return (base * altura);
        
    }
    @Override
    public String toString(){
        return ("\n Base:"+base+"Altura:"+altura+"\n");
    }
    
}
