package com.exemplo.pedidos;

public class ValidarValor extends ValidadorPedido {
    @Override
    protected boolean validarRegra(Pedido pedido) {
        if (pedido.getValor() <= 0) {
            System.out.println("Pedido inválido: o valor deve ser maior que zero.");
            return false;
        }
        return true;
    }
}
