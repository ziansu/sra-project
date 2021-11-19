public boolean set(java.util.List<org.springframework.messaging.support.ChannelInterceptor> interceptors) {
    synchronized(this.interceptors) {
        this.interceptors.clear();
        return this.interceptors.addAll(interceptors);
    }
}