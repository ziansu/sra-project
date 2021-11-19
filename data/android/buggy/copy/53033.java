@java.lang.Override
public boolean isSoftWrappingEnabled() {
    com.intellij.openapi.application.ApplicationManager.getApplication().assertIsDispatchThread();
    return ((myUseSoftWraps) && (!(myEditor.isPurePaintingMode()))) && (!(myApplianceManager.getAvailableArea().isEmpty()));
}