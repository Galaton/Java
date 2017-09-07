
package semi4e5;


public class Funcionario {
   protected String nome;
   protected String endereco;
   protected float salario;
   
          public Funcionario(String nome,String endereco,float salario){
           this.nome = nome;
           this.salario = salario;
           this.endereco = endereco;
           
           
       }
              public void ExibirDados(){
        System.out.print("Nome:"+nome+"Salario:"+salario+"Endereco:"+endereco);
        
    }
}
