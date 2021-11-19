@java.lang.Override
public boolean isSelected() {
    waitUntilVisible();
    return getElement().isSelected();
}