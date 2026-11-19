package br.pucrs.questao1.persistencia;

import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class ProdutoRepoJpaImpl implements IProdutoRepository {
    private IProdutoJpaItfRep repository;

    @Autowired
    public ProdutoRepoJpaImpl (IProdutoJpaItfRep repository) {
        this.repository = repository;
    }

    @Override
    public Produto getProdutoCodigo(long codigo) {
        Produto produto = repository.findById(codigo);
        return produto;
    }

    @Override 
    public List<Produto> getProdutos() {
        List<Produto> produtos = repository.findAll();
        if (produtos.size() == 0)
            produtos = new LinkedList<Produto>();

        return produtos;
    }
}
