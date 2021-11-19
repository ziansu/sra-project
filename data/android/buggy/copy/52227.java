@java.lang.Override
public long hash(java.lang.String key) {
    return tools.dsn_crc64(key.getBytes());
}