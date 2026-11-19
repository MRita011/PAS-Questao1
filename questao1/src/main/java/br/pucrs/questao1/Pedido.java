package br.pucrs.questao1.negocio;

import jakarta.persistence.*;

@Entity
public class Pedido {
    @Id
    private long numero;
    private Date data;

    public Pedido () {}

    public Pedido(long numero, Data data) {
        this.numero = numero;
        this.data = data;
    }

    public double calculaValorFinal() {
        double valorItemPedido = preco * quantidade;
    }

}