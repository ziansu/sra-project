public void onDisable() {
    if ((currentLoader) != null) {
        currentLoader.onDisable();
    }
    com.comphenix.protocol.ProtocolLibrary.getProtocolManager().removePacketListeners(this);
    saveConfig();
}