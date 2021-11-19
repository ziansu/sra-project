private void verifyAdministrativeResolverResolves(java.lang.String path) {
    org.mockito.Mockito.verify(this.resolver).resolve(path);
}