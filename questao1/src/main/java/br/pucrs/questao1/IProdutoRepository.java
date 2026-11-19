package br.pucrs.questao1.persistencia;

import java.util.List;

public interface IProdutoRepository {
    List<Produto> getProdutos();
    Produto getProdutoCodigo(long codigo);
}