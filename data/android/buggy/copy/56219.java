public void onEnable() {
    com.nemez.cmdmgr.CommandManager.debugHelpMenu = true;
    com.nemez.cmdmgr.CommandManager.registerCommand(new java.io.File("plugins/test.cmd"), this, this);
}