package com.exemplo.pedidos;

// Factory: escolhe e cria a forma de pagamento solicitada.
public class PagamentoFactory {
    public static PagamentoStrategy criar(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("Forma de pagamento não informada.");
        }

        switch (tipo.toLowerCase()) {
            case "pix":
                return new PagamentoPix();
            case "cartao":
                return new PagamentoCartao();
            default:
                throw new IllegalArgumentException(
                    "Forma de pagamento inválida. Use 'pix' ou 'cartao'."
                );
        }
    }
}
