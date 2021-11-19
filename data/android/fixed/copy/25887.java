@java.lang.Override
public void run() {
    startServiceDiscovery();
    threadHandler.postDelayed(this, 10000);
}