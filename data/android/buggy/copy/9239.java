@java.lang.Override
public void handleEvent(final org.eclipse.swt.widgets.Event event) {
    if (!(this.hasBeenBuilt)) {
        this.widget.build();
        this.hasBeenBuilt = true;
    }
}