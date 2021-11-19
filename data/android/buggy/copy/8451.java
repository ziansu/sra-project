@java.lang.Override
public void set(T t, float time) {
    typeConverter.copyFromObject(t, transition.get());
    transition.set(transition.get(), time);
}