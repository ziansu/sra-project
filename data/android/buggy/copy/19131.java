@java.lang.Override
public void onApplicationEvent(org.springframework.context.event.ContextClosedEvent event) {
    unregister();
}