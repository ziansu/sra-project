@java.lang.Override
public void handleButtonEvent(dialog.ButtonEvent event) {
    switch (event.getId()) {
        case dialog.ButtonEvent.NO :
            dispose();
            break;
        case dialog.ButtonEvent.YES :
            save();
            dispose();
            break;
    }
    confirmation.close();
}