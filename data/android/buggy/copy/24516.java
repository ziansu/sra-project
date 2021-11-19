public static <S> S createService(java.lang.Class<S> serviceClass) {
    retrofit2.Retrofit retrofit = com.example.aaron.restful_clientexample.utils.RetrofitServiceGenerator.builder.client(com.example.aaron.restful_clientexample.utils.RetrofitServiceGenerator.httpClient.build()).build();
    return retrofit.create(serviceClass);
}