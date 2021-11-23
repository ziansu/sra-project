public void success() {
    clear();
    try {
        java.lang.String uri = "index.xhtml";
        javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().dispatch(uri);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}