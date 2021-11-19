public java.lang.String visualizzaOpera(java.lang.Long id) throws java.io.IOException {
    this.operaCorrente = paintingFacade.find(id);
    return "datiQuadro";
}