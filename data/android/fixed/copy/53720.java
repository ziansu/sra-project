public java.lang.String creaProdotto() {
    this.prodotto = productFacade.creaProdotto(nome, descrizione, prezzo, quantitaMagazzino);
    return "prodotto";
}