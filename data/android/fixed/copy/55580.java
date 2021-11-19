@java.lang.Override
public void add(T x) {
    if (x == null)
        throw new java.lang.NullPointerException();
    
    (size)++;
    set(((size) - 1), x);
    rise(((size) - 1));
}