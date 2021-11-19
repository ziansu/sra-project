public void setAntInclude(java.lang.String antInclude) {
    this.antInclude = antInclude;
    if ((this.antFilter) == null) {
        this.antFilter = new org.apache.camel.component.file.AntPathMatcherGenericFileFilter<T>();
    }
    this.antFilter.setIncludes(antInclude);
}