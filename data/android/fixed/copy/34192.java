@java.lang.Override
public void clear() {
    for (int i = 0; i < (getColumnCount()); i++) {
        clear(i, 0, getColumnCount());
    }
}