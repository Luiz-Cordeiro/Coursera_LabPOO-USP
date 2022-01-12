package pacote_colecoes_java;

public class Conta {
	private String titular;
	private double saldo;
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getTitular() {
		return titular;
	}
}
