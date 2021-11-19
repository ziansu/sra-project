public static void addInfoMessage(java.lang.String msg, java.lang.String detail) {
    javax.faces.application.FacesMessage facesMsg = new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_INFO, "INFO", detail);
    javax.faces.context.FacesContext.getCurrentInstance().addMessage(null, facesMsg);
}