@java.lang.Override
public long ramBytesUsed() {
    org.elasticsearch.index.translog.Translog.Location translogLocation = translogLocation();
    return (org.elasticsearch.index.engine.DeleteVersionValue.BASE_RAM_BYTES_USED) + (translogLocation != null ? translogLocation.ramBytesUsed() : 0);
}