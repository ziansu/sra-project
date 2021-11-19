public boolean isXtremWeb() {
    return (getScheme()) == null ? false : (getScheme().compareToIgnoreCase(xtremweb.communications.Connection.xwScheme())) == 0;
}