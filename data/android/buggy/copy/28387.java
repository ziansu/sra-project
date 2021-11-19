@java.lang.Override
public java.lang.Object answer(org.mockito.invocation.InvocationOnMock invocation) throws java.lang.Throwable {
    this.unansweredCallCallback = ((com.google.common.base.Predicate<java.lang.String>) (invocation.getArguments()[0]));
    return null;
}