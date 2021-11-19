@java.lang.Override
public org.springframework.ide.eclipse.boot.dash.livexp.ObservableSet<org.springframework.ide.eclipse.boot.dash.model.BootDashElement> getElements() {
    if ((elements) == null) {
        elements = new org.springframework.ide.eclipse.boot.dash.livexp.LiveSetVariable<org.springframework.ide.eclipse.boot.dash.model.BootDashElement>();
        refresh(null);
    }
    return elements;
}