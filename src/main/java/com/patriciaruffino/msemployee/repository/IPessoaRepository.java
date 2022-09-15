package com.patriciaruffino.msemployee.repository;

import com.patriciaruffino.msemployee.model.Pessoa;

import java.util.List;

public interface IPessoaRepository {
    public Pessoa cadastrar(Pessoa novo);
    public Pessoa atualizarDados (Pessoa dados);
    public Pessoa buscarPessoaPorId (Long id);
    public List<Pessoa> buscarTodos ();

    public void excluir (Long id);
}
