package com.davidgimelle.springrest.tuto;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This controller does a CRUD of Entities Computer. It's an example of how implement Rest methods 
 * GET, POST, PUT, DELETE with Spring MVC.
 * Entities computer are store in a pseudo persistance unit.
 *  
 * Example: create an new entity by a POST on http://localhost:8080/SpringMVC/rest/computer with JSON content
 * {"reference":"INS1","description":"Test","model":"Inspiron 3000","brand":"DELL"} 
 * and http header Content-Type : application/json; charset=utf-8
 *  
 * @author David Gimelle = http://www.getj2ee.overblog.com = Mar 10, 2012 
 */
@Controller
@RequestMapping("/computer") 
public class ComputerController {
	
	/*pseudo persistance unit uses by the controller*/
	private static final ComputerStorage computerStorage = new ComputerStorage();
	
	@RequestMapping(method = RequestMethod.GET) 
	public @ResponseBody List<Computer> getComputers() { 
		return computerStorage.getAll();
	}
	
	@RequestMapping(method = RequestMethod.POST) 
	@ResponseBody 
	public void addComputer(@RequestBody Computer computer) { 
		computerStorage.add(computer);
	}
	
	@RequestMapping(value="{id}",method = RequestMethod.PUT)
	@ResponseBody
	public void putComputer(@PathVariable long id, @RequestBody Computer computer) {
		computer.setId(id);
		computerStorage.update(computer);
	}	

	@RequestMapping(value="{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteComputer(@PathVariable long id) {
		computerStorage.delete(id);
	}

	
}