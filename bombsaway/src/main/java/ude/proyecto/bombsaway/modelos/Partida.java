package ude.proyecto.bombsaway.modelos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "partidas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Partida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_partida")
	private int id;

	@Column(name = "nombre", nullable = false, unique = true, length = 50)
	private String nombre;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "partidas_jugadores", joinColumns = @JoinColumn(name = "id_partida"), inverseJoinColumns = @JoinColumn(name = "id_jugador"))
	private List<Jugador> jugadores;

}
