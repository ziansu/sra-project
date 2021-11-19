@org.skywalking.apm.toolkit.opentracing.NeedSnifferActivation(value = "1. ContextManager#activeSpan()" + "2. SkywalkingSpan#setTag(String, String)")
@java.lang.Override
public io.opentracing.Span setTag(java.lang.String key, java.lang.String value) {
    return this;
}