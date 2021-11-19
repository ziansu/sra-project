public void disableIfNotCompatible() {
    if (!(this.compatible)) {
        this.getPluginLoader().disablePlugin(this);
    }
}