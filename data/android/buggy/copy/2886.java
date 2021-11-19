@java.lang.Override
public java.sql.Blob convertToDatabaseColumn(byte[] attribute) {
    try {
        return new javax.sql.rowset.serial.SerialBlob(attribute);
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException(e.getMessage(), e);
    }
}