package pe.com.cibertec.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_empleado")
@NoArgsConstructor
@AllArgsConstructor

public class empleadoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "dni_empleado", nullable = false)
	private Integer dni_empleado;
	
	@Column (name = "nombre_empleado", nullable = false)
	private String nombre_empleado;

	@Column (name = "apellido_empleado", nullable = false)
	private String apellido_empleado;
	
	@Column (name = "fecha_nacimiento", nullable = false)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate fecha_nacimiento;
	
	@Column (name = "direccion", nullable = false)
	private String direccion;
	
	@Column (name = "correo", nullable = false)
	private String correo;

	
	
	public Integer getDni_empleado() {
		return dni_empleado;
	}



	public void setDni_empleado(Integer dni_empleado) {
		this.dni_empleado = dni_empleado;
	}



	public String getNombre_empleado() {
		return nombre_empleado;
	}



	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}



	public String getApellido_empleado() {
		return apellido_empleado;
	}



	public void setApellido_empleado(String apellido_empleado) {
		this.apellido_empleado = apellido_empleado;
	}



	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}



	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public areaEntity getAreaentity() {
		return areaentity;
	}



	public void setAreaentity(areaEntity areaentity) {
		this.areaentity = areaentity;
	}



	@ManyToOne
	@JoinColumn(name="fk_area", nullable = false)
	private areaEntity areaentity;
}
