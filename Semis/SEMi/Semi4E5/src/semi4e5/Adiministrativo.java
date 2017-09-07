
package semi4e5;


public class Adiministrativo extends Assistente {
    private String turno;
    
    public Adiministrativo(String turno,String nome,String endereco,int matricula,float salario){
        super(nome,endereco,matricula,salario);
        this.turno = turno;
    }
        @Override
        public void ExibirDados(){
            
        System.out.print("Nome:"+nome+"Matricula:"+matricula+"Salario:"+salario+"Endereco:"+endereco+"Turno:"+turno);
        
    }
}
