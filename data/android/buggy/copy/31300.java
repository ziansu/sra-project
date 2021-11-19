private int inferWantedArgumentPosition(org.mockito.invocation.InvocationOnMock invocation) {
    return (wantedArgumentPosition) == (org.mockito.internal.stubbing.answers.ReturnsArgumentAt.LAST_ARGUMENT) ? (invocation.getArguments().length) - 1 : wantedArgumentPosition;
}