public void sendUpdateMessage() {
    if ((communicationManager) == null)
        return ;
    
    de.ohg.fitag.android.discoveryVehicleRemote.DataMessage message = de.ohg.fitag.android.discoveryVehicleRemote.DataMessage.build().append("degree", java.lang.Math.round(new_rotation));
    communicationManager.sendMessage(message);
}