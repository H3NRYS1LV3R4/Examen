package pe.com.cibertec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.model.areaEntity;
import pe.com.cibertec.repository.areaRepository;
import pe.com.cibertec.service.areaService;

@Service
public class areaServiceImpl implements areaService {

	@Autowired
	private areaRepository arearepository;
	
	@Override
	public List<areaEntity> obtenerTodasAreas() {
		// TODO Auto-generated method stub
		return arearepository.findAll();
	}
}
