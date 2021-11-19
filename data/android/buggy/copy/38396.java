private void harvestAllCodes(boolean reload) throws java.lang.InterruptedException {
    for (no.dcat.harvester.crawler.Types type : no.dcat.harvester.crawler.Types.values()) {
        no.dcat.harvester.crawler.Loader.logger.debug("Loading type {}", type);
        harvestCode(reload, type.getSourceUrl(), type.getType());
    }
}