@java.lang.Override
public java.lang.Object afterMethod(com.a.eye.skywalking.api.plugin.interceptor.EnhancedClassInstanceContext context, com.a.eye.skywalking.api.plugin.interceptor.enhance.InstanceMethodInvokeContext interceptorContext, java.lang.Object ret) {
    this.whenExist(context, new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.a.eye.skywalking.api.context.ContextManager.stopSpan();
        }
    });
    return ret;
}