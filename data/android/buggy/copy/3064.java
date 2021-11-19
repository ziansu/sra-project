public com.github.rjeschke.txtmark.Configuration.Builder registerPlugins(org.markdown4j.Plugin... plugins) {
    for (org.markdown4j.Plugin plugin : plugins) {
        this.plugins.add(plugin);
    }
    return this;
}