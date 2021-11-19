private void removeFilter() throws javax.servlet.ServletException {
    if ((this.filter) != null) {
        hudson.util.PluginServletFilter.removeFilter(this.filter);
        this.filter.destroy();
        this.filter = null;
    }
}