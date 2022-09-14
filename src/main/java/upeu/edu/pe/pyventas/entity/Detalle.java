package upeu.edu.pe.pyventas.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Detalle {
	private int iddetalle;
	private int idventa;
	private int idproducto;
	private double precio;
	private int cantidad;

}
