@java.lang.Override
public com.google.inject.Module next() {
    final com.google.inject.Module module = moduleIt.next();
    de.skuzzle.tinyplugz.guice.TinyPlugzGuice.LOG.debug("Installing module '{}'", module);
    return module;
}