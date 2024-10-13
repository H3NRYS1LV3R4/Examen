package pe.com.cibertec.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;
import lombok.RequiredArgsConstructor;
import pe.com.cibertec.model.empleadoEntity;
import pe.com.cibertec.model.areaEntity;
import pe.com.cibertec.service.areaService;
import pe.com.cibertec.service.empleadoService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/empleado")
public class empleadoController {
	
	private final areaService areaservice;
	private final empleadoService empleadoservice;
	
	@GetMapping("/")
	public String listarEmpleados(Model model) {
	    List<empleadoEntity> listarEmpleado = empleadoService.listarEmpleado();
	    model.addAttribute("listaempl", listarEmpleado);
	    return "lista_producto";
	}
	
	
	@GetMapping("/registrar_Empleado")
	public String mostrarRegistrarEmpleado(Model model) {
		List<empleadoEntity>listarArea = areaService.obtenerTodasAreas();
		model.addAttribute("area", listarArea);
		model.addAttribute("empleados", new empleadoEntity());
		return "registrar_Empleado";
	}
	
	@PostMapping("registrar_Empleado")
	public String registrarProducto(@ModelAttribute("empleado")empleadoEntity empleadoentity,
			Model model) {
		empleadoService.crearEmpleado(empleadoEntity);
		return "redirect:/empleados/";
	}
	


}
