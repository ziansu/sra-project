@java.lang.Override
public void setFieldDoubleNull(java.lang.Double value) {
    realm.checkIfValid();
    if (value == null) {
        row.setNull(columnInfo.fieldDoubleNullIndex);
        return ;
    }
    row.setDouble(columnInfo.fieldDoubleNullIndex, value);
}