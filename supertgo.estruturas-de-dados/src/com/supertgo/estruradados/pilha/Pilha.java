package com.supertgo.estruradados.pilha;

import com.supertgo.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T>{
	
	public Pilha () {
		super();
	}
	
	public void empilha (T elemento) {
		this.adiciona(0, elemento);
	}
	
	public T desempilha () {
		
		if (this.estaVazia()) return null;
		
		T elementoToRemove = this.elementos.get(0);
		this.remover(0);
		
		return elementoToRemove;
	}
	
	public T topo () {
		if (this.estaVazia()) return null;
		
		
		return this.elementos.get(0);
	}
	
}
