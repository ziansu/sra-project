private T generateDynamicWrapper(C menuContext) {
    @java.lang.SuppressWarnings(value = "unchecked")
    T newProxyInstance = ((T) (java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), new java.lang.Class[]{ interfaceClass }, getInvocationHandler(menuContext))));
    return newProxyInstance;
}