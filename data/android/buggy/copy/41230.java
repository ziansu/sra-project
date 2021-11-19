@java.lang.Override
public void reloadConfig() {
    java.lang.System.out.println("OnReloadConfig");
    super.reloadConfig();
    this.config = getConfig();
}