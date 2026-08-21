package br.com.dio.service.impl;

import br.com.dio.model.Cliente;
import br.com.dio.model.ClienteRepository;
import br.com.dio.model.Endereco;
import br.com.dio.model.EnderecoRepository;
import br.com.dio.service.ClientService;
import br.com.dio.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClientService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    @Override
    public Cliente findById(long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void insert(Cliente cliente) {
        salvarClienteComCep(cliente);
    }



    @Override
    public void update(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
                if(clienteBd.isPresent()){
                    salvarClienteComCep(cliente);
                }
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(()->{
            Endereco novoEndereco = viaCepService.consultaCEP(cep);
            return enderecoRepository.save(novoEndereco);
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
