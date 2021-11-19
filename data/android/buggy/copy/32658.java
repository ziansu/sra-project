public java.lang.String visualizzaOpera(java.lang.Long id) throws java.io.IOException {
    this.operaCorrente = paintingFacade.find(id);
    javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().redirect("/siw-progetto-2017/datiQuadro.xhtml");
    return "datiQuadro";
}