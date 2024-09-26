package com.store.app_store.infrastructure.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.store.app_store.domian.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,String>{

}
