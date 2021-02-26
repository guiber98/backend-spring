package ude.proyecto.bombsaway.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import ude.proyecto.bombsaway.modelos.Partida;

public interface IDaoPartidas extends JpaRepository<Partida, Integer> {

	public boolean existsByNombre(String nombre);
	
	public Partida findByNombre(String nombre);
}
