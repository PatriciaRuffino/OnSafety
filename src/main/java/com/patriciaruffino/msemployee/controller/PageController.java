package com.patriciaruffino.msemployee.controller;

import com.patriciaruffino.msemployee.model.Pessoa;
import com.patriciaruffino.msemployee.service.impl.PessoaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class PageController {
    @Autowired
    private PessoaServiceImp service;

    @GetMapping("/home")
    public String home (Model model){
      List<Pessoa> pessoas = service.buscarTodos();
      model.addAttribute("pessoas", pessoas);
      return "home";
    }



}
