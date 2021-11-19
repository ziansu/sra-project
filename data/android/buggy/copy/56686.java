private void disposeSource() {
    org.mule.runtime.core.api.lifecycle.LifecycleUtils.disposeIfNeeded(source, org.mule.runtime.module.extension.internal.runtime.source.ExtensionMessageSource.LOGGER);
}