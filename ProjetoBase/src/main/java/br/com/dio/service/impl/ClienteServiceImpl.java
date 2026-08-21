package br.com.dio.service.impl;

import br.com.dio.model.Cliente;
import br.com.dio.service.ClientService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClientService {
    @Override
    public Iterable<Cliente> findAll(){
        return null;
    }

    @Override
    public Cliente findById(long id) {
        return null;
    }

    @Override
    public void insert(Cliente cliente) {

    }

    @Override
    public void update(Cliente cliente) {

    }

    @Override
    public void delete(Cliente cliente) {

    }

    @Override
    public void update(Long id, Cliente cliente) {

    }

    @Override
    public void delete(Long id) {

    }
}
