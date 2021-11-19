@com.musicforall.config.Bean
@com.musicforall.config.Scope(value = "request", proxyMode = ScopedProxyMode.INTERFACES)
public org.springframework.social.twitter.api.Twitter twitter(com.musicforall.config.ConnectionRepository repository) {
    com.musicforall.config.Connection<org.springframework.social.twitter.api.Twitter> connection = repository.findPrimaryConnection(org.springframework.social.twitter.api.Twitter.class);
    return connection != null ? connection.getApi() : null;
}