private io.openio.sds.socket.PooledSocket tryCreate() {
    return canCreate() ? create() : null;
}