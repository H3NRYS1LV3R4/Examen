package pe.com.cibertec.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cibertec.model.empleadoEntity;
import pe.com.cibertec.repository.empleadoRepository;
import pe.com.cibertec.service.empleadoService;

@Service
public class empleadoServiceImpl implements empleadoService {

	@Autowired
	private empleadoRepository empleadorepository;
	
	
	@Override
	public List<empleadoEntity> listarEmpleado() {
		// TODO Auto-generated method stub
		return empleadorepository.findAll();
	}
	
	
	@Override
	public void crearEmpleado(empleadoEntity empleado) {
		empleadorepository.save(empleado);
	}
	
	
	@Override
	public empleadoEntity buscarEmpleadoPorId(Integer id) {
		// TODO Auto-generated method stub
		return empleadorepository.findById(id)
				.get();
	}
	
	
	@Override
	public void actualizarEmpleado(Integer id, empleadoEntity empleadoActualizado) {
		// TODO Auto-generated method stub
		empleadoEntity empleadoEncontrado = buscarEmpleadoPorId(id);
		if(empleadoEncontrado == null) {
			throw new RuntimeException("Empleado no encontrado");
		}
		try {
			empleadoEncontrado.setNombre_empleado(empleadoActualizado.getNombre_empleado());
			empleadoEncontrado.setApellido_empleado(empleadoActualizado.getApellido_empleado());
			empleadoEncontrado.setFecha_nacimiento(empleadoActualizado.getFecha_nacimiento());
			empleadoEncontrado.setDireccion(empleadoActualizado.getDireccion());
			empleadoEncontrado.setCorreo(empleadoActualizado.getCorreo());
			empleadorepository.save(empleadoEncontrado);
		}catch (Exception e) {
			throw new RuntimeException("Error al actualizar");
		}
		
		
	}
	
	@Override
	public void eliminarEmpleado(Integer id) {
		// TODO Auto-generated method stub
		empleadoEntity empleadoEncontrado = buscarEmpleadoPorId(id);
		if(empleadoEncontrado == null) {
			throw new RuntimeException("Usuario no encontrado");
		}
		empleadorepository.delete(empleadoEncontrado);
		
	}
}
