private int inferWantedArgumentPosition(org.mockito.invocation.InvocationOnMock invocation) {
    if ((wantedArgumentPosition) == (org.mockito.internal.stubbing.answers.ReturnsArgumentAt.LAST_ARGUMENT))
        return (invocation.getArguments().length) - 1;
    
    return wantedArgumentPosition;
}