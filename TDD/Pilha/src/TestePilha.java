import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestePilha {

	Pilha p ;
	@Before
	public void inicializa(){
		p = new Pilha(10);
	}
	
	@Test
	public void pilhaVazia() {
		
		assertTrue(p.estaVazia());//Quero verifivar se esta retornado verdadeiro a func 
		assertEquals(0,p.tamanho());//verifica se o retorno da func e 0
	}
	@Test
	public void empilhaUmElemento() {//verifica o empilhamento de 1 elemento na pilha
		
		p.empilha("primeiro");
		assertFalse(p.estaVazia());
		assertEquals(1,p.tamanho());
		assertEquals("primeiro",p.topo());
	}
	@Test
	public void empilhaEDesempilha() {
		
		p.empilha("primeiro");
		p.empilha("segundo");
		assertFalse(p.estaVazia());
		assertEquals(2,p.tamanho());
		assertEquals("segundo",p.topo());
		Object desempilhado = p.desempilha();
		assertEquals(1,p.tamanho());
		assertEquals("segundo",desempilhado);
		assertEquals("primeiro",p.topo());
	}
	@Test(expected=PilhaVaziaException.class)
	public void removerDaPilha(){
		p.desempilha();
	}
	
	@Test
	public void encherDaPilha(){
		try {
			for(int i = 0;i<15;i++){
				p.empilha(i);
			}
		} catch (PilhaCheiaException e) {
			
			e.printStackTrace();
		}
	}
}
