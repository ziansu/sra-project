@java.lang.Override
public void requestDestinationTile(models.ctrlCommand.CTRLCommand callbackObject) {
    this.currentCommand = callbackObject;
    this.destinationTile = null;
    msgGen.requestTile(currentInstance);
}