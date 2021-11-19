public void setDefaultFuzzySearch(boolean fuzzy) {
    net.di2e.ecdr.commons.query.rest.parsers.BasicQueryParser.LOGGER.debug("ConfigUpdate: Updating the default fuzzy search from [{}] to [{}]", defaultDateType, fuzzy);
    defaultFuzzySearch = fuzzy;
}