package com.store.app_store.infrastructure.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.store.app_store.application.services.IClienteService;
import com.store.app_store.domian.entity.Cliente;

public class ClienteImpl implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Cliente> findById(String id) {
        return clienteRepository.findById(id);
    }

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> update(String id, Cliente cliente) {
        Optional<Cliente> clienteOld = clienteRepository.findById(id);
        if (clienteOld.isPresent()) {
            Cliente clientedb = clienteOld.orElseThrow();
            clientedb.setNombre(id);
            return Optional.of(clienteRepository.save(clientedb));
        }
        return Optional.empty();
    }

    @Override
    public Optional<Cliente> delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
