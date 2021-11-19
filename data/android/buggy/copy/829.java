@java.lang.Override
public void stop() throws org.mule.runtime.api.exception.MuleException {
    scheduler.stop();
    refs.clear();
}