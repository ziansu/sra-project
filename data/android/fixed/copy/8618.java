@java.lang.Override
public boolean deletedField(java.lang.String fieldName, java.lang.Object value) {
    boolean migrated = false;
    if ("in2Old".equals(fieldName)) {
        isdeletedFieldIn2_right_type = (value != null) && (value instanceof org.talend.daikon.serialize.jsonio.PersistenceObjectForFieldRemoved.InnerClass2);
        migrated = true;
    }
    return migrated;
}