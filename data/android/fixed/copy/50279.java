public void rollbackTimeout() {
    try {
        socket.setSoTimeout(timeout);
    } catch (java.net.SocketException ex) {
        broken = true;
        throw new redis.clients.jedis.exceptions.JedisConnectionException(ex);
    }
}