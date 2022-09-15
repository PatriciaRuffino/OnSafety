package com.patriciaruffino.msemployee.DAO;

import com.patriciaruffino.msemployee.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaDAO extends JpaRepository<Pessoa, Long> {
}
