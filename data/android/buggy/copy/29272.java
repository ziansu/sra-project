@java.lang.Override
public io.opentracing.Span setOperationName(java.lang.String operationName) {
    wrappedSpan.setOperationName(operationName);
    return this;
}