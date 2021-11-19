@java.lang.Override
public boolean enable(net.escapecraft.escapePlug.EscapePlug plugin) {
    plugin.registerEvents(new de.hydrox.lockdown.LockdownListener(plugin));
    plugin.registerCommands(this);
    return true;
}