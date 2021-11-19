public void back() throws java.io.IOException {
    (iter)++;
    javax.faces.context.ExternalContext ec = javax.faces.context.FacesContext.getCurrentInstance().getExternalContext();
    fr.trendev.bean.MyBeanJSF.logger.log(java.util.logging.Level.INFO, "BACK LINK ");
    ec.redirect(ec.getRequestContextPath());
}