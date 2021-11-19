public void add(int index, org.springframework.messaging.support.ChannelInterceptor interceptor) {
    (this.size)++;
    this.interceptors.add(index, interceptor);
}