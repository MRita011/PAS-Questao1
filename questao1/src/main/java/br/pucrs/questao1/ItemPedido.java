package br.pucrs.questao1;

import java.lang.annotation.Inherited;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
public class ItemPedido {
    @Id
    private long id;
    private int quantidade;

    public ItemPedido(){}

    public ItemPedido(long id, int quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }

    public double calculaValorItem()
}