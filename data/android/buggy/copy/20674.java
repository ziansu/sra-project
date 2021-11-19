boolean isExpired() {
    return this.expire.after(new java.sql.Date(java.lang.System.currentTimeMillis()));
}