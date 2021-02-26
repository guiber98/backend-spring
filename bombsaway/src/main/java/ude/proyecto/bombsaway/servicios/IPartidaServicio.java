package ude.proyecto.bombsaway.servicios;

import ude.proyecto.bombsaway.modelos.Partida;

public interface IPartidaServicio {

	public Partida guardarPartida();
	
	public boolean existePartida(String nombre);
	
	public Partida cargarPartida(String nombre);
	
}
