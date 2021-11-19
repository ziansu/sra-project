@java.lang.Override
public <Builder extends org.elasticsearch.action.search.SearchRequestBuilder> Builder buildPage(Builder builder) throws java.lang.Exception {
    logger.trace("#################Called {} #buildPage", getClass().getSimpleName());
    return canBuildPage() ? internalBuildPage(builder) : builder;
}