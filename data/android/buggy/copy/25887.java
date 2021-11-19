@java.lang.Override
public void run() {
    removeServiceAdvertiser();
    stopServiceDiscovery();
    addServiceAdvertiser();
    startServiceDiscovery();
    threadHandler.postDelayed(this, 10000);
}