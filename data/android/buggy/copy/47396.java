@org.springframework.context.annotation.Bean
@org.springframework.context.annotation.Scope(value = "request", proxyMode = org.springframework.context.annotation.ScopedProxyMode.INTERFACES)
public org.springframework.social.twitter.api.Twitter twitter(org.springframework.core.env.Environment environment) {
    return new org.springframework.social.twitter.api.impl.TwitterTemplate(environment.getProperty("twitter.consumerKey"), environment.getProperty("twitter.consumerSecret"), environment.getProperty("twitter.accessToken"), environment.getProperty("twitter.accessTokenSecret"));
}