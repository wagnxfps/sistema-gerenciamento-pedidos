package com.exemplo.pedidos;

// Strategy: define uma interface comum para diferentes formas de pagamento.
public interface PagamentoStrategy {
    void pagar(double valor);
}
