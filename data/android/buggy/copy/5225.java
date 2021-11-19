private void verifyResolverIsNotClosed() {
    org.mockito.Mockito.verify(this.resolver, org.mockito.Mockito.never()).close();
}