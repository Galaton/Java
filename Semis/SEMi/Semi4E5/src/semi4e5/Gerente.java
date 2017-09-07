
package semi4e5;

public class Gerente extends Funcionario {
    private static float bonus;
    
    public Gerente(String nome,String endereco,float salario){
       super(nome,endereco,salario);
    }
    public void BonusValor(float bonus){
        this.bonus = bonus;
    }
    @Override
    public void ExibirDados(){
        System.out.print("Nome:"+nome+"Bonus:"+bonus+"Salario:"+salario+"Endereco:"+endereco);
        
    }
    
}
