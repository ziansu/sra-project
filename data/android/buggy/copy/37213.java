@java.lang.Override
public void validateCellValue(java.nio.ByteBuffer cellValue) throws org.apache.cassandra.serializers.MarshalException {
    if (org.apache.cassandra.db.marshal.CollectionType.isMultiCell())
        valueComparator().validate(cellValue);
    else
        super.validateCellValue(cellValue);
    
}