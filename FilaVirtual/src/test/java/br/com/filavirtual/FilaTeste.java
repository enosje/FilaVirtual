package br.com.filavirtual;

import java.util.Date;

import br.com.filavirtual.entities.FilaConsultorio;
import br.com.filavirtual.service.FabricaFichasConsultorio;

public class FilaTeste {

	public static void main(String[] args) {

		FilaConsultorio fc = new FilaConsultorio();
		FabricaFichasConsultorio f = new FabricaFichasConsultorio();
		fc.setPosicaoAtual(0);
		fc.setPrefixoFicha("Medico-");
		
		for (int i = 0; i < 200; i++) {

			System.out.println(f.fichaSimples(fc)+"  "+ new Date().toString());

		}
	}

}
