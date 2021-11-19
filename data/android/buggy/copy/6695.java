private void onExpire(orestes.bloomfilter.cachesketch.ExpirationQueue.ExpiringItem<T> entry) {
    expirations.remove(entry.getItem(), entry.getExpiration());
    this.remove(entry.getItem());
}