public java.lang.Double getValorTotalTransacoes() {
    java.lang.Double valorTotal = 0.0;
    for (com.snf.model.Transacao transacao : consultaTransacaoVM.getCaixaSelecionado().getTransacoes()) {
        valorTotal += transacao.getValor();
    }
    return valorTotal;
}