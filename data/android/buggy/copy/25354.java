public java.util.List<hudson.plugins.tfs.model.ChangeSet> getDetailedHistory(java.lang.String singleVersionSpec) {
    final com.microsoft.tfs.core.clients.versioncontrol.specs.version.VersionSpec toVersion = com.microsoft.tfs.core.clients.versioncontrol.specs.version.VersionSpec.parseSingleVersionFromSpec(singleVersionSpec, null);
    return getVCCHistory(null, toVersion, true, java.lang.Integer.MAX_VALUE);
}