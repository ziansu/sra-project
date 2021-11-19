public java.lang.String signOut() {
    javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    return "employeeSignIn";
}