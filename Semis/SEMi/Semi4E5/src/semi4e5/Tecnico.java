
package semi4e5;


public class Tecnico extends Assistente{
        private static float bonus;
    
    public Tecnico(String nome,String endereco,float salario,int matricula){
       super(nome,endereco,matricula,salario);
    }
    public void BonusValor(float bonus){
        this.bonus = bonus;
    }
    @Override
    public void ExibirDados(){
        System.out.print("Nome:"+nome+"Bonus:"+bonus+"Salario:"+salario+"Endereco:"+endereco);
        
    }
    
    
}
