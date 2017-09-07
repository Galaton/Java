
package e4l5;

public class Quadrado extends Quadrilatero implements FormaGeometrica {
    
    private float lado;
            
    public Quadrado(float lado){
        super(lado,lado,lado,lado);
        this.lado = lado;
    }
    
    @Override
    public float calcArea(){
        
        return (lado*lado);
    }
    @Override
    public String toString(){
        return ("\n Lado:"+lado+"\n");
    }
}
