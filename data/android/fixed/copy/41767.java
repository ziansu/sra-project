@java.lang.Override
public <A> boolean interceptSuccess(io.techery.janet.ActionHolder<A> holder) {
    return onInterceptSuccess(holder);
}