package com.patriciaruffino.msemployee.controller;

import com.patriciaruffino.msemployee.Repository.PessoaRepository;
import com.patriciaruffino.msemployee.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class PageController {
    @Autowired
    private PessoaRepository repository;

    @GetMapping("/home")
    public String home (Model model){
      List<Pessoa> pessoas = repository.findAll();
      model.addAttribute("pessoas", pessoas);
      return "home";
    }



}
