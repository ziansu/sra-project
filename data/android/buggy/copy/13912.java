protected void addDefaultLoader() {
    loaders.add(systemLoader);
    loaders.add(parentLoader);
    loaders.add(currentLoader);
    loaders.add(threadLoader);
}