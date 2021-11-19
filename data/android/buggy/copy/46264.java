@java.lang.Override
public void setAliases(java.util.Collection<jfdi.storage.apis.AliasAttributes> aliases) {
    assert aliases != null;
    this.aliases.addAll(aliases);
    buildAliasMap();
}