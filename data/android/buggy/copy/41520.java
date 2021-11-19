@java.lang.Override
public T get(int i) {
    if ((list) == null) {
        throw new java.lang.IndexOutOfBoundsException((("Index: " + i) + ", Size: 0"));
    }
    return list.get(i);
}