@java.lang.Override
public java.lang.Object afterMethod(com.a.eye.skywalking.api.plugin.interceptor.enhance.StaticMethodInvokeContext interceptorContext, java.lang.Object ret) {
    com.a.eye.skywalking.api.context.ContextCarrier carrier = new com.a.eye.skywalking.api.context.ContextCarrier();
    com.a.eye.skywalking.api.context.ContextManager.inject(carrier);
    return carrier.getTraceSegmentId();
}