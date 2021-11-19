@java.lang.Override
public void onEnable() {
    registerEvents();
    registerCommands();
    new vg.civcraft.mc.civmodcore.itemHandling.NiceNames().loadNames(this);
    info("Main Plugin Events and Config Command registered");
}