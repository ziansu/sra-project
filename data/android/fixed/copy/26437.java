public org.metaborg.spoofax.core.project.settings.Format format() {
    @javax.annotation.Nullable
    java.lang.String value = this.config.getString(org.metaborg.spoofax.core.project.configuration.ConfigurationBasedSpoofaxLanguageSpecConfig.PROP_FORMAT);
    return value != null ? org.metaborg.spoofax.core.project.settings.Format.valueOf(value) : org.metaborg.spoofax.core.project.settings.Format.ctree;
}