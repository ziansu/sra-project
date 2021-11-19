@java.lang.Override
public void add(T x) {
    (size)++;
    set(((size) - 1), x);
    rise(((size) - 1));
}