package br.com.filavirtual.service;

import java.util.List;

import br.com.filavirtual.entities.FilaConsultorio;

public interface FabricaFichaConsultorioInterface extends
		FabricaFichaGenerico<FilaConsultorio> {
	
	public String fichaSimples(FilaConsultorio fila);

	public String fichaPreferencial(FilaConsultorio fila);
	
	public List<FilaConsultorio> fila();

}
