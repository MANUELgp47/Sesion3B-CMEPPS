package pkg;

public class Cuenta {

	double saldo;
	String numero;
	String titular;

	public Cuenta(String numero, String titular, double saldo) {
		super();
		this.saldo = saldo;
		this.numero=numero;
		this.titular=titular;
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void Ingresar(int i) {
		this.setSaldo(this.getSaldo()+i);

	}

	public void Retirar(int i) {
		if (this.getSaldo() >= i)
			this.setSaldo(this.getSaldo()-i);

	}

}
