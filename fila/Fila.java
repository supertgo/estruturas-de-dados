package com.supertgo.estruturadados.fila;

import com.supertgo.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{
	
	public Fila () {
		super();
		
	}

	
	public void enfileira (T elemento) {
		this.adiciona(elemento);
		
		
	}
	
	public T espiar () {
		if (this.estaVazia()) return null;
		
		return this.elementos.get(0);
		
	}
	
	public T desenfileira () {
		
		if (this.estaVazia()) return null;
		
		final int POS = 0;
		
		T elementoToRemove = this.elementos.get(0);
		
		this.remover(POS);
		
		return elementoToRemove;
	}
}
