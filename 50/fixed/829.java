@java.lang.Override
public void stop() throws org.mule.runtime.api.exception.MuleException {
    if ((scheduler) != null) {
        scheduler.stop();
    }
    refs.clear();
}