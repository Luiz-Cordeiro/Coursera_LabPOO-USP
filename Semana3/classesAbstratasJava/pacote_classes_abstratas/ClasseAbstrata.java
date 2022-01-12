package pacote_classes_abstratas;

public abstract class ClasseAbstrata {
	
	public abstract String getInformacao();
	
	public abstract int getValor();
	
	public abstract void setValor(int valor);
	
	public String getToString() {
		return this.toString();
	}
	
	
}