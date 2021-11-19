public boolean isInstalled(com.constellio.model.entities.modules.Module module) {
    for (com.constellio.model.entities.modules.Module anInstalledModule : getInstalledModules()) {
        if (anInstalledModule.getClass().equals(module.getClass())) {
            return true;
        }
    }
    return false;
}