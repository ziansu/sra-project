public java.util.List<java.lang.String> list() throws java.lang.InterruptedException, org.apache.zookeeper.KeeperException {
    return _zk.getChildren("/", false);
}