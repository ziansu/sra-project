@java.lang.Override
public java.sql.Blob convertToDatabaseColumn(byte[] attribute) {
    try {
        if (attribute == null)
            return null;
        
        return new javax.sql.rowset.serial.SerialBlob(attribute);
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException(e.getMessage(), e);
    }
}