@java.lang.Override
public void configure() {
    bind(java.time.Clock.class).toInstance(java.time.Clock.systemDefaultZone());
    bind(services.ApplicationTimer.class).asEagerSingleton();
    bind(Counter.class).to(services.AtomicCounter.class);
}