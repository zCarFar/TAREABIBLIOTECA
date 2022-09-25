package upeu.edu.pe.biblioteca.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.biblioteca.dao.Operaciones;
import upeu.edu.pe.biblioteca.entity.Detalle_prestamo;
@Component
public class Detalle_prestamoDaoimpl implements Operaciones<Detalle_prestamo> {

	@Autowired	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Detalle_prestamo t) {
		// TODO Auto-generated method stub
		String SQL="INSERT INTO prestamo(iddetalle_prestamo, idprestamo, idlibro) values(0,?,?)";
		return jdbcTemplate.update(SQL, t.getIdprestamo(), t.getIdlibro());
		
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
		String SQL ="SELECT * FROM biblioteca.detalle_prestamo";
		return jdbcTemplate.queryForList(SQL);
	}
}
