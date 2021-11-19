@java.lang.Override
protected eu.unifiedviews.plugins.transformer.unzipper.UnZipperConfig_V1 getConfiguration() throws eu.unifiedviews.dpu.config.DPUConfigException {
    final eu.unifiedviews.plugins.transformer.unzipper.UnZipperConfig_V1 cnf = new eu.unifiedviews.plugins.transformer.unzipper.UnZipperConfig_V1();
    cnf.setNotPrefixed(((checkNotPrefix.getValue()) == null ? true : !(checkNotPrefix.getValue())));
    return cnf;
}