public static org.camunda.bpm.extension.mockito.mock.FluentJavaDelegateMock registerJavaDelegateMock(final java.lang.Class<? extends org.camunda.bpm.engine.delegate.JavaDelegate> type) {
    return org.camunda.bpm.extension.mockito.DelegateExpressions.registerJavaDelegateMock(org.camunda.bpm.extension.mockito.function.NameForType.juelNameFor(type));
}