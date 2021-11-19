@java.lang.Override
public java.lang.String getColumnText(java.lang.Object element, int columnIndex) {
    java.lang.String value = ((java.lang.String) (element));
    if (columnIndex == 0) {
        return value.replace(" ", "");
    }
    throw new java.lang.IllegalStateException();
}