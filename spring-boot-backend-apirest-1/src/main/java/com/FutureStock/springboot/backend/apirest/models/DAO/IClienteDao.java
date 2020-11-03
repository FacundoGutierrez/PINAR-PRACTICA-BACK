package com.FutureStock.springboot.backend.apirest.models.DAO;

import org.springframework.data.repository.CrudRepository;

import com.FutureStock.springboot.backend.apirest.models.entity.Cliente;
public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
