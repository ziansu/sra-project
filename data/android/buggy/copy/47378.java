@java.lang.Override
public void readFunc(byte header) {
    asset.Property prop = asset.SlaveList.slaveSearch(this);
    byte[] buf = server.TestServer.serialize(prop);
    server.TestServer.doSend(buf);
}