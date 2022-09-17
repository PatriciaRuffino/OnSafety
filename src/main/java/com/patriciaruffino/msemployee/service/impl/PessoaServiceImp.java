package com.patriciaruffino.msemployee.service.impl;

import com.patriciaruffino.msemployee.DAO.PessoaDAO;
import com.patriciaruffino.msemployee.model.Pessoa;
import com.patriciaruffino.msemployee.service.IPessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PessoaServiceImp  implements IPessoaRepository {

    @Autowired
    private PessoaDAO dao;
    @Override
    public Pessoa cadastrar(Pessoa novo) {
        return dao.save(novo);
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
