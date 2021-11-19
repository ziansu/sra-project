@java.lang.Override
public boolean isNullAt(int ordinal) {
    return columns[ordinal].isNullAt(rowId);
}