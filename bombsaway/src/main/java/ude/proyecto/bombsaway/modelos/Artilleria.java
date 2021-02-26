package ude.proyecto.bombsaway.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "aviones")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Artilleria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_artilleria")
	private int id;

	@OneToOne
	@JoinColumn(name = "id_posicion_artilleria", nullable = false)
	private Posicion posicion;
	
}
