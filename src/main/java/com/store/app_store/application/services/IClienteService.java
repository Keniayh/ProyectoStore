package com.store.app_store.application.services;

import java.util.List;
import java.util.Optional;

import com.store.app_store.domian.entity.Cliente;

public interface IClienteService {
    List<Cliente> findAll();
    Optional<Cliente> findById(String id);
    Cliente save(Cliente cliente);
    Optional<Cliente> update(String id, Cliente cliente);
    Optional<Cliente> delete(String id);
}
