public void removeConsumer() {
    synchronized(this) {
        (this.totalConsumers)--;
    }
}