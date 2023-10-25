package com.ciberfarma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ciberfarma.repository.ICategoriaRepository;
import com.ciberfarma.repository.IProductoRepository;
import com.ciberfarma.repository.IProveedorRepository;

//1 paso uno agregar la anotacion 
@Controller
public class ProductoController {
     //2 creae el acceso
	//get --> href o url /cargar paginas
	//post--> form con method post/ grabar,etc
	
	//3 llamar a los repositorios de BD
	@Autowired
	private ICategoriaRepository repocat;
	@Autowired
	private IProveedorRepository repoprot;
@Autowired
private IProductoRepository res;
	@GetMapping("/cargar")
	public String cargarCrud(Model model) {
		//--acciones
		
		//como enviar datos en Spring --> usando Atributte
		model.addAttribute("lstCategorias", repocat.findAll());
		model.addAttribute("lstProveedor", repoprot.findAll());
		model.addAttribute("lstProductos", res.findAll());
		
		//Salida
		return "crudproductos";
	}
}
