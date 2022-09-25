package upeu.edu.pe.biblioteca.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.daoimpl.Detalle_prestamoDaoimpl;
import upeu.edu.pe.biblioteca.entity.Detalle_prestamo;
@Service
public class Detalle_prestamoService implements Operaciones<Detalle_prestamo> {

	@Autowired
	private Detalle_prestamoDaoimpl daoimpl;

	@Override
	public int create(Detalle_prestamo t) {
		// TODO Auto-generated method stub
		return daoimpl.create(t);
	}

	@Override
	public int update(Detalle_prestamo t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Detalle_prestamo read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Detalle_prestamo> reAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoimpl.readAll2();
	}
	
}
