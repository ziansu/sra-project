@java.lang.Override
public java.lang.Object intercept(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args, net.sf.cglib.proxy.MethodProxy methodProxy) throws java.lang.Throwable {
    java.lang.Object result = null;
    methodProxy.invoke(this.targetObject, args);
    return result;
}