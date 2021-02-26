package ude.proyecto.bombsaway.modelos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "jugadores")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Jugador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_jugador")
	private int id;

	@Column(name = "nombre", nullable = false, unique = true, length = 50)
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "id_avion")
	private List<Avion> aviones;
	
}
