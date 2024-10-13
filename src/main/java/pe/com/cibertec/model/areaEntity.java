package pe.com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name= "tb_area")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class areaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "area_id", nullable = false)
	private Integer area_id;
	
	@Column (name = "nombre_area", nullable = false)
	private String nombre_area;

}
