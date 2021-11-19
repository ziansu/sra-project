public void setQcFilters(java.util.HashMap<java.lang.String, java.lang.Boolean> qcFilters) {
    zooActivateWrite();
    setModified(true);
    this.qcFilters = qcFilters;
}