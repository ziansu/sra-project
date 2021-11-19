@java.lang.Override
public void onReadingStarted(java.util.concurrent.BlockingQueue<com.spartango.hicgraph.data.HiCRead> readQueue) {
    source = readQueue;
    buildThread.start();
}