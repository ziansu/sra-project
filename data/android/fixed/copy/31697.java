@java.lang.Override
public void setAcceptableValues(java.util.Collection<T> values) {
    clear();
    for (T value : values) {
        addItem(value);
    }
}