@java.lang.Override
protected long loadSize() {
    try {
        errorFlag |= false;
        return getSearchQuery().count();
    } catch (java.lang.Exception e) {
        fr.openwide.core.wicket.more.model.AbstractSearchQueryDataProvider.LOGGER.error("Erreur lors de la recherche : {}", e);
        errorFlag |= true;
        return 0;
    }
}