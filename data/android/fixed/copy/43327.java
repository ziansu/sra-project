public java.lang.String trovaProdotto() {
    this.prodotto = productFacade.getProduct(codice);
    return "prodotto";
}