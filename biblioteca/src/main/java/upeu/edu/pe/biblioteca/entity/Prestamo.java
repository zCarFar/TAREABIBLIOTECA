package upeu.edu.pe.biblioteca.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {
	
	private int idprestamo;
	private String fecha_prestamo;
	private String fecha_dovolucion;
	private int idalumno;
	private int idempleado;
	

}
