public void setGivenName(java.lang.String givenName) {
    if (!(givenName.isEmpty())) {
        this.givenName = (givenName.substring(0, 1).toUpperCase()) + (givenName.substring(1));
    }
}