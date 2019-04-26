package trabajadores;

public class PorHorasExtras extends Ingreso {
	private Integer horasExtrasRealizadas;

	
	public Integer getHorasExtrasRealizadas() {
		return horasExtrasRealizadas;
	}

	public void setHorasExtrasRealizadas(Integer horasExtrasRealizadas) {
		this.horasExtrasRealizadas = horasExtrasRealizadas;
	}

		
	public PorHorasExtras(Integer percepcion, String concepto, Integer montoPercibido, Integer horasExtrasRealizadas) {
		super(percepcion, concepto, montoPercibido);
		this.horasExtrasRealizadas = horasExtrasRealizadas;
	}
	
	
	private Integer pagoExtra() {
		return this.getHorasExtrasRealizadas() * 2;    // cuanto cobra por hora extraaa???
	}
	
	
	public Integer totalPercibido() {
		return super.totalPercibido() + this.pagoExtra();
	}
}
