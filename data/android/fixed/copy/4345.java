public void setUsername(java.lang.String username) {
    if (com.alibaba.druid.pool.StringUtils.equals(this.username, username)) {
        return ;
    }
    if (inited) {
        throw new java.lang.UnsupportedOperationException();
    }
    this.username = username;
}