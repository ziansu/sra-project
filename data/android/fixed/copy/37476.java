public void displayStatus(int time, java.lang.String message, de.syscy.kagegui.icon.ItemIcon statusIcon) {
    statusTime = time;
    statusMessage = message;
    this.statusIcon = statusIcon;
    gui.markDirty();
}