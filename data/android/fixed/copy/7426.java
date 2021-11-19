public void add(com.eleybourn.bookcatalogue.searchorder.SearchProvider provider) {
    provider.setState((((provider.getId()) & (mProvidersEnabled)) != 0));
    mList.add(provider);
}