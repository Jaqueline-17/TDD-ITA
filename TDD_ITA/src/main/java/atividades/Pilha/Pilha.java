package atividades.Pilha;

public class Pilha {
    
    private Object[] elementos;
    private int quantidade = 0;

    
    public Pilha(int maximo) {
        elementos = new Object[maximo];
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }

    public Integer tamanho() {
        return quantidade;
    }

    public void empilhar(Object elementos) {
    	if(quantidade == elementos.lenght) {
    		throw new PilhaCheiaException("N�o � poss�vel empilhar mais elementos");
    	}
        this.elementos[quantidade] = elementos;
        quantidade++;
    }

    public Object topo() {
        return elementos[quantidade-1];
    }

    public Object desempilha() {
        if(estaVazia()) {
            throw  new PilhaVaziaException("N�o � poss�vel desempilhar!");} 
        Object topo = topo();
        quantidade--;
        return topo;
    }

    
}
