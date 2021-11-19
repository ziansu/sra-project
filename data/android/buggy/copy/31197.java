boolean expire(long expiryTime) {
    return ((count.expire(expiryTime)) & (rate.expire(expiryTime))) & (latency.expire(expiryTime));
}