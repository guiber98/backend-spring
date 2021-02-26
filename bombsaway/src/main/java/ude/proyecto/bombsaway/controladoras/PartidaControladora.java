package ude.proyecto.bombsaway.controladoras;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ude.proyecto.bombsaway.modelos.Partida;

@RestController
@RequestMapping(value = "/partidas")
public class PartidaControladora {

	@PostMapping
	public Partida create() {
		return null;
	}

}
