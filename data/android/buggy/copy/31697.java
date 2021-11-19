@java.lang.Override
public void setAcceptableValues(java.util.Collection<T> values) {
    this.values.clear();
    clear();
    for (T value : values) {
        addItem(value);
    }
}