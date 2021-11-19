@java.lang.Override
public void setErrorChannel(org.springframework.messaging.MessageChannel errorChannel) {
    super.setErrorChannel(errorChannel);
    this.listener.setErrorChannel(errorChannel);
}