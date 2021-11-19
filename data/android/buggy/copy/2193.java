@java.lang.Override
protected void configureInbound(org.springframework.security.config.annotation.web.messaging.MessageSecurityMetadataSourceRegistry messages) {
    messages.nullDestMatcher().authenticated().simpDestMatchers("/topic/**").authenticated().simpTypeMatchers(SimpMessageType.MESSAGE, SimpMessageType.SUBSCRIBE).denyAll().anyMessage().denyAll();
}