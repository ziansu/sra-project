@java.lang.Override
public com.googlecode.paradox.data.table.value.FieldValue parse(final com.googlecode.paradox.metadata.ParadoxTable table, final java.nio.ByteBuffer buffer, final com.googlecode.paradox.metadata.ParadoxField field) {
    final long l = (buffer.getInt()) & 2147483647;
    return new com.googlecode.paradox.data.table.value.FieldValue(l, java.sql.Types.BIGINT);
}