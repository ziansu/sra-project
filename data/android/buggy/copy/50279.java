public void rollbackTimeout() {
    try {
        socket.setSoTimeout(timeout);
        socket.setKeepAlive(false);
    } catch (java.net.SocketException ex) {
        broken = true;
        throw new redis.clients.jedis.exceptions.JedisConnectionException(ex);
    }
}