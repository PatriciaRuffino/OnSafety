package com.patriciaruffino.msemployee.controller;

import com.patriciaruffino.msemployee.Repository.PessoaRepository;
import com.patriciaruffino.msemployee.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class PessoaController {

    @Autowired
    private PessoaRepository repository;



    @GetMapping("/form")
    public String pessoasForm(Pessoa pessoa) {

        return "addFuncForm";
    }

    // Adiciona novo funcionario
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public String salvar(Pessoa pessoa) {
        repository.save(pessoa);
        return "redirect:/home";
    }

    // Acessa o formulario de edição
    @GetMapping("form/{id}")
    public String updateForm(Model model, @PathVariable(name = "id") Long id) {

        Pessoa pessoa = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        model.addAttribute("pessoa", pessoa);
        return "atualizaForm";
    }

    // Atualiza funcionario
    @PostMapping("update/{id}")
    public String alterarProduto(@Valid Pessoa pessoa, BindingResult result, @PathVariable Long id) {

        if (result.hasErrors()) {
            return "redirect:/form";
        }

        repository.save(pessoa);
        return "redirect:/home";
    }

    @GetMapping("delete/{id}")
    @CacheEvict(value = "pessoa", allEntries = true)
    public String delete(@PathVariable(name = "id") Long id, Model model) {

        Pessoa pessoa = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

       repository.delete(pessoa);
        return "redirect:/home";
    }


}


