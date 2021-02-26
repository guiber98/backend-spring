package ude.proyecto.bombsaway.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ude.proyecto.bombsaway.daos.IDaoPartidas;
import ude.proyecto.bombsaway.modelos.Partida;

@Service
public class PartidaServicio implements IPartidaServicio {

	@Autowired
	private IDaoPartidas daoPartidas;
	
	public Partida guardarPartida() {
		return null;
	}
	
	public boolean existePartida(String nombre) {
		return this.daoPartidas.existsByNombre(nombre);
	}

	public Partida cargarPartida(String nombre) {
		return this.daoPartidas.findByNombre(nombre);
	}
}
