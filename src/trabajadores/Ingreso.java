package trabajadores;

public class Ingreso {
	private Integer percepcion;
	private String concepto;
	private Integer montoPercibido;
	
	
	public Integer getPercepcion() {
		return percepcion;
	}

	public void setPercepcion(Integer percepcion) {
		this.percepcion = percepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Integer getMontoPercibido() {
		return montoPercibido;
	}

	public void setMontoPercibido(Integer montoPercibido) {
		this.montoPercibido = montoPercibido;
	}


	public Ingreso(Integer percepcion, String concepto, Integer montoPercibido) {
		this.percepcion = percepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	
	public Integer totalPercibido() {
		return this.getMontoPercibido();
	}
	
	public Integer getMontoImponible() {
		return this.getMontoPercibido();
	}
	
}
