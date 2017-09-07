
package e1l5;


public class Loja {

    public static void main(String[] args) {
        Produto [] vetor;
        vetor = new Produto[5];
        
        vetor[0] = new Livro("Bob o construtor","Juca",(float)50.5);
        vetor[1] = new CD("Anos 80",(float)20,10);
        vetor[2] = new DVDs("Xuxa",(float)10,(float)100.50);
        vetor[3] = new Livro("D&d","Barry Allan",(float )54);
        vetor[4] = new CD("Axe 2012",(float)55,5);
        
        for(int i = 0;i<5;i++){
            System.out.print(vetor[i].toString());
        }
    }
    
}
