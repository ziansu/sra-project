@java.lang.Override
public void handleEvent(final org.eclipse.swt.widgets.Event event) {
    if (!(hasBeenBuilt)) {
        widget.build();
        hasBeenBuilt = true;
    }
}