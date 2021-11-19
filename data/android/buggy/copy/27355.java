@java.lang.Override
public void onEnable() {
    getCommand("tosogame").setExecutor(new com.pekomiya.mctosogame.command.TosoSettingCommand());
    super.onEnable();
}