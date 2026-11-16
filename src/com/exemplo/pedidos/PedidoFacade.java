package com.exemplo.pedidos;

// Facade: esconde os detalhes de validação e pagamento
// e apresenta um único método para processar o pedido.
public class PedidoFacade {
    private final ValidadorPedido cadeiaValidacao;

    public PedidoFacade() {
        ValidarCliente cliente = new ValidarCliente();
        ValidarValor valor = new ValidarValor();
        ValidarEstoque estoque = new ValidarEstoque();

        cliente.definirProximo(valor).definirProximo(estoque);
        this.cadeiaValidacao = cliente;
    }

    public void processarPedido(Pedido pedido, String formaPagamento) {
        System.out.println("Iniciando processamento do pedido...");

        if (!cadeiaValidacao.validar(pedido)) {
            System.out.println("Pedido não foi processado.");
            return;
        }

        PagamentoStrategy pagamento = PagamentoFactory.criar(formaPagamento);
        pagamento.pagar(pedido.getValor());

        System.out.println("Pedido de " + pedido.getCliente() + " processado com sucesso!");
    }
}
