public boolean isSuperHuman(java.lang.String name) {
    for (java.lang.String heroes : SuperHumans.instance.getConfig().getConfigurationSection("superhumans").getKeys(false)) {
        return name.equalsIgnoreCase(heroes);
    }
    return false;
}