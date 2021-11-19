public void displayStatus(int time, java.lang.String message, de.syscy.kagegui.icon.ItemIcon statusIcon) {
    statusTime = time;
    statusMessage = message;
    statusIcon = icon;
    gui.markDirty();
}