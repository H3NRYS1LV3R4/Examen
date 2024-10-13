package pe.com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.cibertec.model.areaEntity;

@Repository
public interface areaRepository extends JpaRepository<areaEntity, Integer>{

}
