package upeu.edu.pe.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.biblioteca.entity.Detalle_prestamo;
import upeu.edu.pe.biblioteca.service.Detalle_prestamoService;
@RestController
@RequestMapping("/api/detalle_prestamo")
public class Detalle_prestamoController {
	
	@Autowired
	private Detalle_prestamoService detalle_prestamoService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
		return detalle_prestamoService.readAll2();

	}
	@PostMapping
	public int guardar(@RequestBody Detalle_prestamo detalle_prestamo) {
		return detalle_prestamoService.create(detalle_prestamo);

	}
}
