package br.com.dio.controller;


import br.com.dio.model.Cliente;
import br.com.dio.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("clientes")
public class ClientRestController {
    @Autowired
    private ClientService clientService;
    @GetMapping
    public ResponseEntity<Iterable<Cliente>> findAll(){
        return ResponseEntity.ok(clientService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable long id){
        return ResponseEntity.ok(clientService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Cliente> insert(@RequestBody Cliente cliente){
        clientService.insert(cliente);
        return  ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Long id,@RequestBody Cliente cliente){
        clientService.update(id,cliente);
        return  ResponseEntity.ok(cliente);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Cliente> delete(@PathVariable Long id){
        clientService.delete(id);
        return ResponseEntity.ok().build();
    }
}
