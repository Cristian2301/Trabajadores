package trabajadores;

import java.util.ArrayList;

public class Trabajador {
	private ArrayList <Ingreso> ingresos = new ArrayList<Ingreso>();
	
//	private Trabajador() {
//		this.ingresos = new ArrayList<Ingreso>();
//	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
	
	public Integer getTotalPercibido() {
		Integer percibido = 0;
			for (Ingreso i : ingresos) {
				percibido += i.totalPercibido(); 
			}
			return percibido;
	}
	
	public Integer getTotalMontoImponible() {
		Integer montosImponibles = 0;
				for (Ingreso i : ingresos) {
					montosImponibles += i.getMontoImponible();
				}
				return montosImponibles;
	}
	
	public Integer getImpuestoAPagar() {
		return (this.getTotalMontoImponible() * 2) / 100;
	}
}
