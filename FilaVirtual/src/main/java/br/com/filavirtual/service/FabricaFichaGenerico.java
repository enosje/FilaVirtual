package br.com.filavirtual.service;

import java.util.List;

public interface FabricaFichaGenerico<T> {

	public String fichaSimples(T objeto);

	public String fichaPreferencial(T objeto);
	
	public List<T> fila();
}
