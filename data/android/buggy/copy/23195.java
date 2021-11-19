public io.vertx.rxjava.ext.sql.SQLConnection setQueryTimeout(int timeoutInSeconds) {
    this.delegate.setQueryTimeout(timeoutInSeconds);
    return this;
}