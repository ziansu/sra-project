public synchronized void connected(cn.com.sparkle.firefly.net.client.NetNode node) {
    this.node = node;
    connectEvent.connect(address, node);
    future.set(true);
}