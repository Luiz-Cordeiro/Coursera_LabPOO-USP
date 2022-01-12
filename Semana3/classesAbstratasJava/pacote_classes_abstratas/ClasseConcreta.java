package pacote_classes_abstratas;

public class ClasseConcreta extends ClasseAbstrata {
	private String informacao = "info";
	private int valor = 15600;
	

	@Override
	public String getInformacao() {
		return informacao;
	}

	@Override
	public int getValor() {
		return valor;
	}

	@Override
	public void setValor(int valor) {
		this.valor = valor;
	}

}
