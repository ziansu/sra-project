public long timestamp() {
    return org.apache.cassandra.utils.memory.MemoryUtil.getLong(((peer) + (org.apache.cassandra.db.rows.NativeCell.TIMESTAMP)));
}