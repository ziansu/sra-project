public static javax.servlet.http.HttpSession getSession(boolean etat) {
    return ((javax.servlet.http.HttpSession) (javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getSession(etat)));
}