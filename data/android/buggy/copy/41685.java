@Advice.OnMethodExit(inline = false)
public static void onInterceptingHttpAccessorCreated(@net.bytebuddy.asm.Advice.This
org.springframework.http.client.support.InterceptingHttpAccessor httpAccessor) {
    final org.stagemonitor.requestmonitor.RequestMonitorPlugin requestMonitorPlugin = org.stagemonitor.core.Stagemonitor.getPlugin(org.stagemonitor.requestmonitor.RequestMonitorPlugin.class);
    httpAccessor.getInterceptors().add(new org.stagemonitor.web.tracing.SpringRestTemplateContextPropagatingTransformer.SpringRestTemplateContextPropagatingInterceptor(requestMonitorPlugin));
}