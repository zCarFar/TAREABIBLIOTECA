package upeu.edu.pe.biblioteca.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.daoimpl.PrestamoDaoimpl;
import upeu.edu.pe.biblioteca.entity.Prestamo;
@Service
public class PrestamoService implements Operaciones<Prestamo> {

		@Autowired
		private PrestamoDaoimpl daoimpl;

		@Override
		public int create(Prestamo t) {
			// TODO Auto-generated method stub
			return daoimpl.create(t);
		}

		@Override
		public int update(Prestamo t) {
			// TODO Auto-generated method stub
			return daoimpl.update(t);
		}

		@Override
		public int delete(int id) {
			// TODO Auto-generated method stub
			return daoimpl.delete(id);
		}

		@Override
		public Prestamo read(int id) {
			// TODO Auto-generated method stub
			return daoimpl.read(id);
		}

		@Override
		public List<Prestamo> reAll() {
			// TODO Auto-generated method stub
			return daoimpl.reAll();
		}

		@Override
		public List<Map<String, Object>> readAll2() {
			// TODO Auto-generated method stub
			return daoimpl.readAll2();
		}
		
}
