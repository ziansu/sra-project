public com.enonic.xp.index.PatternIndexConfigDocument.Builder addPattern(final com.enonic.xp.index.PathIndexConfig pathIndexConfig) {
    this.pathIndexConfigs.add(pathIndexConfig);
    this.stringPathIndexConfigMap.put(pathIndexConfig.getPath().resetAllIndexesTo(0).toString().toLowerCase(), pathIndexConfig);
    return this;
}