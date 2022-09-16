package com.patriciaruffino.msemployee.controller;

import com.patriciaruffino.msemployee.model.Pessoa;
import com.patriciaruffino.msemployee.service.impl.PessoaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PessoaController {

    @Autowired
    private PessoaServiceImp service;

    @GetMapping("/pessoas")
    public List<Pessoa> buscarTodos (){
        return service.buscarTodos();
    }
    @GetMapping("pessoas/{id}")
    public ResponseEntity<Pessoa> buscarPessoaPorId(@PathVariable Long id){
        Pessoa res = service.buscarPessoaPorId(id);
        if(res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }
    @PostMapping("/pessoas")
    public ResponseEntity<Pessoa> cadastrar(@Valid @RequestBody Pessoa novo){
        Pessoa res = service.cadastrar(novo);
        if(res != null){
            ResponseEntity.ok(novo);
        }
        return ResponseEntity.badRequest().build();
    }
    @PutMapping("/pessoas/{id}")
    public ResponseEntity<Pessoa> atualizarDados (@RequestBody Pessoa dados){
        Pessoa res = service.atualizarDados(dados);
        if (res !=null){
            return ResponseEntity.ok(dados);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/pessoas/{id}")
    public ResponseEntity<Pessoa> excluir (@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.ok().build();
    }

}
