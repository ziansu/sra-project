@java.lang.Override
public java.lang.Object convert(com.flipkart.storm.mysql.schema.ColumnDataType columnDataType, java.lang.Object value) {
    if ((value == null) || (value instanceof java.lang.String)) {
        return value;
    }
    return new java.lang.String(((byte[]) (value)));
}