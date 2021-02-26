package ude.proyecto.bombsaway.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "posiciones_aviones")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Posicion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_posicion_avion")
	private int id;

	@Column(name = "eje_x", nullable = false)
	private int ejeX;

	@Column(name = "eje_y", nullable = false)
	private int ejeY;

	@Column(name = "angulo", nullable = false)
	private int angulo;
}
