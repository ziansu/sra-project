@java.lang.Override
public java.lang.Object getValueAt(int rowIndex, int columnIndex) {
    if (isValidIndex(rowIndex)) {
        return getPropertyValue(rowIndex, columnIndex);
    }else {
        return null;
    }
}