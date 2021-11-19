private void handleAndAssignImage(android.graphics.Bitmap bitmap) {
    initialiseNewBitmap();
    org.catrobat.paintroid.command.Command command = new org.catrobat.paintroid.command.implementation.LoadCommand(bitmap);
    PaintroidApplication.commandManager.commitCommandToLayer(new org.catrobat.paintroid.command.implementation.LayerCommand(org.catrobat.paintroid.listener.LayerListener.getInstance().getCurrentLayer()), command);
}