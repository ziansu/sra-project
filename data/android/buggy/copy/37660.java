public java.lang.String getValorTotalCaixas() {
    java.lang.Double valorTotal = 0.0;
    for (com.snf.model.Caixa caixa : consultaTransacaoVM.getCaixas()) {
        valorTotal += (caixa.getValorAtual()) - (caixa.getValorInicial());
    }
    return formatarDouble(valorTotal);
}