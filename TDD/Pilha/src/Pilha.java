
public class Pilha {

	private Object[] pilha;
	private int quantidade = 0;
	private int tamanhoMaximo;
	
	public Pilha(int tamanhoMaximo) {
	
		pilha = new Object[tamanhoMaximo];
		this.tamanhoMaximo = tamanhoMaximo;
	}

	public boolean estaVazia() {
		if(quantidade == 0)
		return true;
		
		return false;
	}

	public int tamanho() {
		
		return quantidade;
	}

	public void empilha(Object elemento) {
		if(quantidade>=tamanhoMaximo)
			throw new PilhaCheiaException("Pilha Cheia");
		
		pilha[quantidade] = elemento;
		quantidade ++;
	}

	public Object topo() {
		
		return pilha[quantidade-1];
	}

	public Object desempilha() {
		if(estaVazia())
			throw new PilhaVaziaException("Nao foi possivel desempilhar");
		Object aux = topo();
		pilha[quantidade-1] = null;
		quantidade --;
		return aux;
	
	}



}
