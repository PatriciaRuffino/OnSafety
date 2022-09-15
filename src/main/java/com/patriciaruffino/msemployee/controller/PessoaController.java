package com.patriciaruffino.msemployee.controller;

import com.patriciaruffino.msemployee.model.Pessoa;
import com.patriciaruffino.msemployee.service.impl.PessoaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PessoaController {

    @Autowired
    private PessoaServiceImp service;

    @GetMapping("/pessoas")
    public List<Pessoa> buscarTodos (){
        return service.buscarTodos();
    }
}
