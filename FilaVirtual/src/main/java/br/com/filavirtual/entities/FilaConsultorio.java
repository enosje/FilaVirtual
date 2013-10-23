package br.com.filavirtual.entities;

public class FilaConsultorio {

	private Integer posicaoAtual;
	private String prefixoFicha;
	private String valorFicha;

	public String getValorFicha() {
		return valorFicha;
	}

	public void setValorFicha(String valorFicha) {
		this.valorFicha = valorFicha;
	}

	public Integer getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setPosicaoAtual(Integer posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}

	public String getPrefixoFicha() {
		return prefixoFicha;
	}

	public void setPrefixoFicha(String prefixoFicha) {
		this.prefixoFicha = prefixoFicha;
	}
}
