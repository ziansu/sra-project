public boolean remove(org.springframework.messaging.support.ChannelInterceptor interceptor) {
    return this.interceptors.remove(interceptor);
}