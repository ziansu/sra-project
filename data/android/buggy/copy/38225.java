public boolean hasAnyDisabledVersion() {
    for (java.lang.Boolean enabled : versionToEnabledMap.values()) {
        if (!enabled)
            return false;
        
    }
    return true;
}