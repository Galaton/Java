
package s78e8;


public class Carro {
    private int codigo,dias;
    private String nome,marca,modelo;
    private float valorLocacao,valorTotal,multa = 0;
    
    public Carro(int codigo,String nome,String marca,String modelo,float valorLocacao){
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.valorLocacao = valorLocacao;
    }


    private float calcMulta(int diasLocado){
        multa = ((float)(diasLocado*valorLocacao)*(float)1.15);
        return multa;
    }
    public float calcValorTotal(int diasLocado){
        if(dias<diasLocado){
            valorTotal =(diasLocado*valorLocacao)+calcMulta(diasLocado-dias);
            return (valorTotal);
        }else{
            valorTotal = (dias*valorLocacao)+multa;
          return (valorTotal);
        }
    }
    public String getCodigo(){
        return ""+codigo;
    }
    public String getInformacoes(){
        return ("Nome:"+nome+" Marca:"+marca+" Modelo:"+modelo);
    }
    public void setValorLocacao(float valor){
        valorLocacao = valor;
    }
}
