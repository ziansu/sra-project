public org.metaborg.spoofax.core.project.settings.Format format() {
    @javax.annotation.Nullable
    org.metaborg.spoofax.core.project.settings.Format value = org.metaborg.spoofax.core.project.settings.Format.valueOf(this.config.getString(org.metaborg.spoofax.core.project.configuration.ConfigurationBasedSpoofaxLanguageSpecConfig.PROP_FORMAT));
    return value != null ? value : org.metaborg.spoofax.core.project.settings.Format.ctree;
}