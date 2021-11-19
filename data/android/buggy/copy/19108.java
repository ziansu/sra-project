public static synchronized org.vitrivr.cineast.core.config.Config sharedConfig() {
    if ((org.vitrivr.cineast.core.config.Config.sharedConfig) == null)
        org.vitrivr.cineast.core.config.Config.loadConfig("cineast.json");
    
    return org.vitrivr.cineast.core.config.Config.sharedConfig;
}