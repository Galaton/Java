package semi4e5;

public class CamarotrInferior extends Vip {
  
    private String lugar;
    
    public CamarotrInferior(float valor,float extra,String lugar){
       super(valor,extra);
       
        this.lugar = lugar;
    }
    public String lugarr(){
        return lugar;
    }
}
