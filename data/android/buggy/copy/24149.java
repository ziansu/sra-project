public void setAntFilterCaseSensitive(boolean antFilterCaseSensitive) {
    if ((this.antFilter) == null) {
        this.antFilter = new org.apache.camel.component.file.AntPathMatcherGenericFileFilter<T>();
    }
    this.antFilter.setCaseSensitive(antFilterCaseSensitive);
}