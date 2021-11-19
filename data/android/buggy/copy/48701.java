public void setEngine(org.mozilla.search.providers.SearchEngine engine) {
    suggestClient = new org.mozilla.gecko.SuggestClient(getActivity(), engine.getSuggestionTemplate(org.mozilla.search.autocomplete.SuggestionsFragment.GECKO_SEARCH_TERMS_URL_PARAM), org.mozilla.search.autocomplete.SuggestionsFragment.SUGGESTION_TIMEOUT, org.mozilla.search.autocomplete.SuggestionsFragment.SUGGESTION_MAX);
}