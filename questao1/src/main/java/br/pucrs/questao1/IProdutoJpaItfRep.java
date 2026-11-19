package br.pucrs.questao1.persistencia;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IProdutoJpaItfRep extends CrudRepository<Produto, Long>{
    List<Produto> findAll();
    Produto findById(long codigo);
}