import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import atividades.Pilha.Pilha;
import atividades.Pilha.PilhaVaziaException;
import atividades.Pilha.PilhaCheiaException;


public class TestePilha {

    private Pilha p;

    @Before
    public void inicializarPilha() {
        p = new Pilha(10);

    }

    @Test
    public void pilhaVazia() {
        inicializarPilha();
        assertTrue(p.estaVazia());
        assertEquals(0, p.tamanho());
    }

    @Test
    public void empilhaUmElemento() {
        inicializarPilha();
        p.empilhar("primeiro");
        assertFalse(p.estaVazia());
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());
    }

    @Test
    public void empilhaDesempilha() {
        inicializarPilha();
        p.empilhar("primeiro");
        p.empilhar("segundo");
        assertEquals(2, p.tamanho());
        assertEquals("segundo", p.topo());
        Object desempilhado = p.desempilha();
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());
        assertEquals("segundo", desempilhado);
    }
    
    @Test
    public void removerDaPilhaVazia() {
    	inicializarPilha();
    	assertThrows(PilhaVaziaException.class, () -> {p.desempilha();});
    }
    
    @Test
    public void adicionaNaPilhaCheia() {
    	inicializarPilha();
    	assertThrows(PilhaCheiaException.class, () -> {
    		for(int i = 0; i < 10; i++) {
    			p.empilhar("elemento"+i);
    		}
    		p.empilhar("Boom!"); });
    }
}








