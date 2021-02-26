package ude.proyecto.bombsaway.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ude.proyecto.bombsaway.enumerados.EstadoAvion;

@Entity
@Table(name = "aviones")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Avion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_avion")
	private int id;

	@OneToOne
	@JoinColumn(name = "id_posicion_avion", nullable = false)
	private Posicion posicion;

	@Column(name = "estado")
	@Enumerated(EnumType.STRING)
	private EstadoAvion estado;

	@Column(name = "combustible")
	private int combustible;

	@Column(name = "vida", nullable = false)
	private int vida;

	@Column(name = "tiene_bomba", nullable = false)
	private boolean tieneBomba;
	
	@ManyToOne
	@JoinColumn(name = "id_jugador")
	private Jugador jugador; 

}
