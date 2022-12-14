package com.patriciaruffino.msemployee.Repository;

import com.patriciaruffino.msemployee.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
