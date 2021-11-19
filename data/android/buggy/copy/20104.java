@java.lang.Override
public void run() {
    init();
    if (!(org.apache.hadoop.hdfs.server.datanode.ShortCircuitWriteServer.used)) {
        org.apache.hadoop.hdfs.server.datanode.ShortCircuitWriteServer.used = true;
        startServer(8899);
    }else {
        startServer(8900);
    }
}