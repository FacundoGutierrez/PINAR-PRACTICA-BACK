package com.FutureStock.springboot.backend.apirest.services;

import com.FutureStock.springboot.backend.apirest.models.entity.*;
import java.util.*;
public interface IClienteService {

	public List<Cliente> findAll();	
	
	public Cliente FindById(Long id);
	
	public Cliente save (Cliente cliente);
	
	public void delete (long id);
}
