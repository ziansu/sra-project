public java.util.List getProfileInstalledVersionsList() {
    java.lang.String OperatingSystemToUse = utils.getOS();
    local.readJson_profiles_KEY(utils.getMineCraft_Launcher_Profiles_json(OperatingSystemToUse));
    local.readJson_profiles_KEY_lastVersionId(utils.getMineCraft_Launcher_Profiles_json(OperatingSystemToUse));
    return local.profiles_lastVersionId;
}