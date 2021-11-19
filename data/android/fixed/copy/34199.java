public com.weinyc.sa.app.dao.NavigationDAO getNavigationDAO() {
    if ((navigationDAO) == null) {
        this.navigationDAO = this.getBean("navigationDAO");
    }
    return this.navigationDAO;
}