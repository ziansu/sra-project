@java.lang.Override
public boolean evaluate(org.apache.spark.sql.catalyst.InternalRow row) {
    return (!(row.isNullAt(ordinal))) && (row.getUTF8String(ordinal).equals(value));
}