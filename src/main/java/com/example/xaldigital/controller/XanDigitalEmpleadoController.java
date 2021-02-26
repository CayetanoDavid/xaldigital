package com.example.xaldigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.xaldigital.model.Empleado;
import com.example.xaldigital.services.EmpleadoServiceImpl;

@RestController
@RequestMapping(value = "empleados")
public class XanDigitalEmpleadoController {
	
	@Autowired
	private EmpleadoServiceImpl empleadoService;
	
	@GetMapping
	public List<Empleado> getEmpleados() {
		return empleadoService.listarTodos();
	}
}
