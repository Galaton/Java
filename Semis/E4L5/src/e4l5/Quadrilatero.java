
package e4l5;

public abstract class Quadrilatero implements FormaGeometrica {
    
    protected float lado1,lado2,lado3,lado4;
    
    public Quadrilatero(float l1,float l2,float l3,float l4){
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
        lado4 = l4;
    }

    public float calcPerimetro(){
        
        return (lado1+lado2+lado3+lado4);
        
    }
    public abstract float calcArea();
    
}
