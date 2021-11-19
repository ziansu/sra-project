@java.lang.Override
public void setFieldBooleanNull(java.lang.Boolean value) {
    realm.checkIfValid();
    if (value == null) {
        row.setNull(columnInfo.fieldBooleanNullIndex);
        return ;
    }
    row.setBoolean(columnInfo.fieldBooleanNullIndex, ((boolean) (value)));
}