@java.lang.Override
public void set(T t, float time) {
    typeConverter.copyFromObject(t, tmp);
    transition.set(tmp, time);
}