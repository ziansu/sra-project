private void onExpire(orestes.bloomfilter.cachesketch.ExpirationQueue.ExpiringItem<T> entry) {
    this.remove(entry.getItem());
    expirations.remove(entry.getItem(), entry.getExpiration());
}