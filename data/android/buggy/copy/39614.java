@java.lang.Override
public void dispose() {
    com.intellij.openapi.util.Disposer.dispose(this);
    jfxPanelRetina.removeNotify();
}