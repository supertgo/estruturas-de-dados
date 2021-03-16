package com.supertgo.estruturadados.base;

import java.util.ArrayList;

public class EstruturaEstatica <T> extends ArrayList {
	
	protected ArrayList <T> elementos;
	protected int tamanho;
	
	public EstruturaEstatica () {
		super();
		this.elementos = new ArrayList<>();
	}
	
	public boolean estaVazia () {
		return this.tamanho == 0;
	}
	
	protected void adiciona (T elemento) {
		
		this.elementos.add(elemento);
		
		updateTam();
	}
	
	protected boolean adiciona (int posi, T elemento) {
		
		if (!verificaPosi(posi)) return false;
		
		this.elementos.add(posi, elemento);
		
		updateTam();
		
		return true;
	}
	
	protected boolean remover (int posi) {
		
		if (!verificaPosi(posi)) return false;
		
		this.elementos.remove(posi);
		
		updateTam();
		
		return true;
	}
	
	public int tamanho () {
		return this.tamanho;
	}
	
	
	private boolean verificaPosi (int posi) {
		
		if (posi < 0 || posi > this.elementos.size())
			throw new IllegalArgumentException("Posição invalida");
		
		return true;
		
	}
	private void updateTam () {
		this.setTamanho(this.elementos.size());
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
