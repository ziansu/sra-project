public <S> S createService(java.lang.Class<S> serviceClass, retrofit2.Converter.Factory factory, java.lang.String baseUrl, java.lang.String username, java.lang.String password) {
    return createService(serviceClass, factory, baseUrl, username, password, null);
}