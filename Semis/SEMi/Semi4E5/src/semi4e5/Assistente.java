
package semi4e5;


public class Assistente extends Funcionario {
    protected int matricula;
    
       public Assistente(String nome,String endereco,int matricula,float salario){
           super(nome,endereco,salario);
           this.matricula = matricula;
           
       }
    
    @Override
        public void ExibirDados(){
            
        System.out.print("Nome:"+" "+nome+" "+"Matricula:"+" "+matricula+" "+"Salario:"+" "+salario+" "+"Endereco:"+" "+endereco);
        
    }
    
}
