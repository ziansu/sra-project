@java.lang.Override
public boolean isNullAt(int ordinal) {
    return data.isNullAt(((offset) + ordinal));
}