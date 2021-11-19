public static <S> S createService(java.lang.Class<S> serviceClass, retrofit2.Converter.Factory factory, java.lang.String baseUrl, java.lang.String username, java.lang.String password) {
    return com.marcohc.architecture.data.net.ServiceGenerator.createService(serviceClass, factory, baseUrl, username, password, null);
}