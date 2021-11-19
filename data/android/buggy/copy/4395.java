io.openio.sds.socket.PooledSocket markUnpooled() {
    this.pooled = false;
    return this;
}