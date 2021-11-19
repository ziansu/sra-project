@java.lang.Override
protected void drawInventory() {
    this.statusBar.drawInventory(this.statusBar.createInventoryArea());
    this.statusBar.drawControl(createHigScore());
}