@java.lang.Override
public boolean contains(java.lang.Object o) {
    T t = ((T) (o));
    return values.containsKey(t);
}