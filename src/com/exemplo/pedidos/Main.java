package com.exemplo.pedidos;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Maria", 150.00, true);

        // Facade: oferece uma forma simples de executar todo o processo.
        PedidoFacade sistema = new PedidoFacade();

        // Formas aceitas: "pix" ou "cartao".
        sistema.processarPedido(pedido, "pix");
    }
}
