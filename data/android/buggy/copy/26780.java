public void saveModules() {
    moduleStore.getLocalStorageIfSupported();
    if ((moduleStore) != null) {
        moduleStore.setItem("modules", moduleList.toJSONString());
    }
}