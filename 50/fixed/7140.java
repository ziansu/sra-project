@java.lang.Override
public void set(T t) {
    typeConverter.copyFromObject(t, tmp);
    set(tmp);
}