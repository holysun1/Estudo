package br.com.dio.service;

import br.com.dio.model.Cliente;
//Interface  com todas as opções de CRUD
public interface ClientService {
    Iterable<Cliente> findAll();
    Cliente findById(long id);
    void insert(Cliente cliente);

    void update(Long id, Cliente cliente);

    void delete(Long id);
}
