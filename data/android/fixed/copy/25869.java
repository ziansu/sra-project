private boolean setupPermissions() {
    org.bukkit.plugin.RegisteredServiceProvider<net.milkbowl.vault.permission.Permission> rsp = getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
    if (rsp != null) {
        de.black921.MultiHome.MultiHome.perms = rsp.getProvider();
    }
    return (de.black921.MultiHome.MultiHome.perms) != null;
}