package com.exemplo.pedidos;

// Chain of Responsibility: cada validador verifica uma regra
// e, se estiver tudo certo, encaminha o pedido ao próximo.
public abstract class ValidadorPedido {
    private ValidadorPedido proximo;

    public ValidadorPedido definirProximo(ValidadorPedido proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public boolean validar(Pedido pedido) {
        if (!validarRegra(pedido)) {
            return false;
        }

        return proximo == null || proximo.validar(pedido);
    }

    protected abstract boolean validarRegra(Pedido pedido);
}
