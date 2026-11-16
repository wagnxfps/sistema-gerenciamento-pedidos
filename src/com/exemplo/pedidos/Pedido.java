package com.exemplo.pedidos;

public class Pedido {
    private final String cliente;
    private final double valor;
    private final boolean estoqueDisponivel;

    public Pedido(String cliente, double valor, boolean estoqueDisponivel) {
        this.cliente = cliente;
        this.valor = valor;
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public boolean isEstoqueDisponivel() {
        return estoqueDisponivel;
    }
}
