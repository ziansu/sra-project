@java.lang.Override
public void modifiedBundle(org.osgi.framework.Bundle bundle, org.osgi.framework.BundleEvent event, java.lang.Object object) {
    if (((event.getType()) == (org.osgi.framework.BundleEvent.UPDATED)) && (isAnAutomationProvider(bundle))) {
        addEvent(event);
    }
}