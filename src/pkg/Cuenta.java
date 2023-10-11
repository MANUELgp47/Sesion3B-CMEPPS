package pkg;

import java.util.ArrayList;

import pkg.Movimiento.TipoMovimiento;

public class Cuenta {

	double saldo;
	String numero;
	String titular;
	ArrayList<Movimiento> movimientos;

	public Cuenta(String numero, String titular, double saldo) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.titular = titular;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void Ingresar(int i) {
		this.setSaldo(this.getSaldo() + i);

		try {
			movimientos.add(new Movimiento(i, numero, TipoMovimiento.H));
		} catch (Exception e) {

		}

	}

	public void Retirar(int i) {
		if (this.getSaldo() - i > -501) {
			this.setSaldo(this.getSaldo() - i);

			try {
				movimientos.add(new Movimiento(i, numero, TipoMovimiento.D));
			} catch (Exception e) {

			}
		}else
			System.out.println("Fondos insuficientes (saldo "+this.getSaldo()+"€ ) en la cuenta "+this.numero+" para el reintegro de "+i+"€");
	}

}
