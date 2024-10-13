package pe.com.cibertec.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.model.empleadoEntity;

@Repository
public interface empleadoRepository extends JpaRepository<empleadoEntity, Integer>{

}