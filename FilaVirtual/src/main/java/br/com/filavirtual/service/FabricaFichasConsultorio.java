package br.com.filavirtual.service;

import java.util.List;

import br.com.filavirtual.entities.FilaConsultorio;

public class FabricaFichasConsultorio implements
		FabricaFichaConsultorioInterface {

	@Override
	public String fichaSimples(FilaConsultorio fila) {
		
		String ficha = fila.getPrefixoFicha()+(fila.getPosicaoAtual()+1);
		fila.setPosicaoAtual(fila.getPosicaoAtual()+1);
		return ficha;
	}

	@Override
	public String fichaPreferencial(FilaConsultorio fila) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FilaConsultorio> fila() {
		// TODO Auto-generated method stub
		return null;
	}

}
