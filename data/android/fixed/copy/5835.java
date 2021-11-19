public void getLeafNames(java.util.List<java.lang.String> store, pal.treesearch.UnrootedMLSearcher.Connection caller) {
    if (caller != (parentConnection_)) {
        throw new java.lang.RuntimeException("Unknown caller!");
    }
    store.add(id_);
}