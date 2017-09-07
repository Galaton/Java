
package e4l5;

public class Circulo implements FormaGeometrica{
    private float raio;
    
    public Circulo(float raio){
        this.raio = raio;
    }
    @Override
    public float calcPerimetro(){
        
        return ((float)3.141592*2*raio);
    }
    @Override
    public float calcArea(){
        return ((float)3.141592*2*raio*raio);
    }
    @Override
    public String toString(){
        
        return("\n Raio:"+raio+"\n");
    }
}
