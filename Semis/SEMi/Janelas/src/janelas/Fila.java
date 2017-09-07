
package janelas;


public class Fila {
    
    private int primeiro;
    private int ultimo;
    private int tamanho;
    
    private int[] fila;
    
    public void criar(int x) {
    fila = new int[x];
    primeiro = 0;
    ultimo = 0;
    tamanho = x;
}
    public void inserir(int x){
        if(ultimo>tamanho){
            ultimo = 0;
            primeiro ++;
        }
        else{
            fila[ultimo]=x;
            ultimo++;
        }
    }
    public void ver(){
        int aux = primeiro,aux1 = 0;
        while(aux1<tamanho){
            System.out.println(fila[aux]);
            aux++;
            aux1++;
            if(aux>tamanho){
                aux = 0;
            }
        }
        
    }
    
}
