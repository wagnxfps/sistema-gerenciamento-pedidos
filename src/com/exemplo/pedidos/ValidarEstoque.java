package com.exemplo.pedidos;

public class ValidarEstoque extends ValidadorPedido {
    @Override
    protected boolean validarRegra(Pedido pedido) {
        if (!pedido.isEstoqueDisponivel()) {
            System.out.println("Pedido inválido: produto sem estoque.");
            return false;
        }
        return true;
    }
}
