public java.util.Map<java.lang.String, java.lang.Object> makeGroupList() {
    return ((org.bukkit.configuration.MemorySection) (joinPreference.joinP.getConfig().get("Groups"))).getValues(false);
}