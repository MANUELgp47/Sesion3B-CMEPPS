package pkg;

public class Movimiento {
	public enum TipoMovimiento{D, H};
	private double importe;
	private String	detalle;
	private TipoMovimiento signo;
	
	
	
	public Movimiento() {
		super();
	}


	public Movimiento(double importe, String detalle, TipoMovimiento signo) {
		super();
		this.importe = importe;
		this.detalle = detalle;
		this.signo = signo;
	}


	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	public TipoMovimiento getSigno() {
		return signo;
	}


	public void setSigno(TipoMovimiento signo) {
		this.signo = signo;
	}
	
	
	
	
	
	
}
