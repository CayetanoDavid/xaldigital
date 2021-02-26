package com.example.xaldigital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.xaldigital.model.Empleado;
import com.example.xaldigital.repositories.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Override
	public List<Empleado> listarTodos() {
		return empleadoRepository.findAll();
	}

}
