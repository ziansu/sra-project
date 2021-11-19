public void onEnable() {
    sendEnableMessage();
    registerCommands();
    registerListeners();
    testUnicode();
    me.sanfrancis.util.Files.createSpawnsFile(this.getServer().getWorld("world"), 2);
}