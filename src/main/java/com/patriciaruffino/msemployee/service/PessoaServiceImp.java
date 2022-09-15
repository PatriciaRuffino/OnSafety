package com.patriciaruffino.msemployee.service;

import com.patriciaruffino.msemployee.DAO.PessoaDAO;
import com.patriciaruffino.msemployee.model.Pessoa;
import com.patriciaruffino.msemployee.repository.IPessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class PessoaServiceImp  implements IPessoaRepository {

    @Autowired
    private PessoaDAO dao;
    @Override
    public Pessoa cadastrar(Pessoa novo) {
        if (novo.getNome() != null){
            return dao.save(novo);
        }
        return null;
    }

    @Override
    public Pessoa atualizarDados(Pessoa dados) {
        if (dados.getNome() != null && dados.getId() != null){
            return dao.save(dados);
        }
        return null;
    }

    @Override
    public Pessoa buscarPessoaPorId(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public List<Pessoa> buscarTodos() {
        return (ArrayList<Pessoa>) dao.findAll();
    }

    @Override
    public void excluir(Long id) {
        dao.deleteById(id);

    }
}
