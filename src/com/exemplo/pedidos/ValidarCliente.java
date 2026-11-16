package com.exemplo.pedidos;

public class ValidarCliente extends ValidadorPedido {
    @Override
    protected boolean validarRegra(Pedido pedido) {
        if (pedido.getCliente() == null || pedido.getCliente().trim().isEmpty()) {
            System.out.println("Pedido inválido: informe o nome do cliente.");
            return false;
        }
        return true;
    }
}
