public java.lang.String logout() {
    javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    return dv512.UserSession.ACTION_LOGOUT;
}