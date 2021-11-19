public boolean setupPermissions() {
    org.bukkit.plugin.RegisteredServiceProvider rsp = getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
    com.gabezter4.Vitals.Vitals.perms = ((net.milkbowl.vault.permission.Permission) (rsp.getProvider()));
    return (com.gabezter4.Vitals.Vitals.perms) != null;
}