package br.pucrs.questao1.persistencia;
import jakarta.persistence.*;

@Entity
public class Produto {
    @Id
    private long codigo;
    private double preco;
    private String descricao;

    public Produto (){}

    public Produto(long codigo, double preco, String descricao) {
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
    }

    public getPreco() {
        return this.preco;
    }
}