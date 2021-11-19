public void reloadNickConfig() {
    try {
        this.NickConfig.load(this.newConfig_nick);
        this.NickConfig.save(this.newConfig_nick);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}