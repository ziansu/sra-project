public us.kbase.auth.AuthConfig withRefreshingToken(final us.kbase.auth.RefreshingToken token) {
    if (token == null) {
        throw new java.lang.NullPointerException("token cannot be null");
    }
    this.token = token;
    return this;
}