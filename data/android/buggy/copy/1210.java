@java.lang.Override
public org.apache.tamaya.spi.ConfigurationContextBuilder removePropertySources(java.util.Collection<org.apache.tamaya.spi.PropertySource> propertySourcesToRemove) {
    this.propertySources.removeAll(propertySourcesToRemove);
    return this;
}