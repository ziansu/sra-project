public int accept(java.lang.reflect.Method method) {
    return indices.get(net.sf.cglib.core.MethodWrapper.create(method));
}