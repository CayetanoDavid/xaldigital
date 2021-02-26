package com.example.xaldigital.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.xaldigital.model.Empleado;

public interface EmpleadoRepository  extends Repository<Empleado, Integer>{
	
	List<Empleado> findAll();

}
