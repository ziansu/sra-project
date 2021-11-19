public void setAuthenticated(boolean isAuthenticated) throws java.lang.IllegalArgumentException {
    if (isAuthenticated) {
        throw new java.lang.IllegalArgumentException("Cannot set this token to trusted - use constructor which takes a GrantedAuthority list instead");
    }
    super.setAuthenticated(false);
}