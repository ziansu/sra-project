public java.util.List<io.github.xsocks.model.Profile> getAllProfile() {
    profiles = reloadAll();
    return profiles.getProfiles();
}