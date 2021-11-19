public java.lang.String creaProdotto() {
    this.prodotto = productFacade.creaProdotto(nome, codice, descrizione, prezzo, quantitaMagazzino);
    return "prodotto";
}