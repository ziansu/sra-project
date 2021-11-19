@java.lang.Override
public void setAliases(java.util.Collection<jfdi.storage.apis.AliasAttributes> aliases) {
    assert aliases != null;
    this.aliases = new java.util.ArrayList<jfdi.storage.apis.AliasAttributes>();
    this.aliases.addAll(aliases);
    buildAliasMap();
}