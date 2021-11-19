@dagger.Provides
@javax.inject.Singleton
@com.mounacheikhna.reactiveapp.annotation.ApiClient
okhttp3.OkHttpClient provideApiClient(okhttp3.OkHttpClient client, @com.mounacheikhna.reactiveapp.annotation.NetworkInterceptors
java.util.List<okhttp3.Interceptor> networkInterceptors) {
    client.networkInterceptors().addAll(networkInterceptors);
    return client;
}