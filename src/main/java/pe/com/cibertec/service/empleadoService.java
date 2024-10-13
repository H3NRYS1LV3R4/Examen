package pe.com.cibertec.service;

import java.util.List;

import pe.com.cibertec.model.empleadoEntity;

public interface empleadoService {
	
	List<empleadoEntity>listarEmpleado();
	void crearEmpleado(empleadoEntity empleadoentity);
	
	empleadoEntity buscarEmpleadoPorId(Integer id);
	
	void actualizarEmpleado(Integer id, empleadoEntity empleadoentity);
	
	void eliminarEmpleado(Integer id);
}
