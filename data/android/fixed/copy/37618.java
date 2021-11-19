public java.lang.Package createPackage(java.lang.String packageName) {
    return org.mockito.Mockito.when(org.mockito.Mockito.mock(java.lang.Package.class).getName()).thenReturn(packageName).getMock();
}