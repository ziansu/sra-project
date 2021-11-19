public org.onosproject.ui.table.TableModel.Row cell(java.lang.String columnId, java.lang.Object value) {
    com.google.common.base.Preconditions.checkNotNull(value, "Must supply some value");
    checkId(columnId);
    cells.put(columnId, value);
    return this;
}