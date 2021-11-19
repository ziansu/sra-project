@java.lang.Override
public void stop() {
    cn.rtmap.flume.source.sftp.SFTPSource.LOG.info("Stopping sftp source {} ...", getName());
    super.stop();
}