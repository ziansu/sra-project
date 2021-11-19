private boolean setupPermissions() {
    org.bukkit.plugin.RegisteredServiceProvider<net.milkbowl.vault.permission.Permission> permissionProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
    if (permissionProvider != null) {
        permission = permissionProvider.getProvider();
    }
    return (permission) != null;
}