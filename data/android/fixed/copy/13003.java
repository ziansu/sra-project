@java.lang.Override
public T set(int index, T element) {
    if ((index >= 0) && (index < (values.length))) {
        values[index] = element;
    }
    return get(index);
}