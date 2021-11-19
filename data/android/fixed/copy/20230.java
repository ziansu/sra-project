@java.lang.Override
public com.hiriver.unbiz.mysql.lib.protocol.binlog.extra.BinlogPosition getCurrentTransBeginPos() {
    if ((gtIdString) == null) {
        return null;
    }
    return getFullGtIdString();
}