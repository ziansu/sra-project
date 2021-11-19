public void registerSubloader(com.agentecon.classloader.SimulationHandle source, com.agentecon.classloader.RemoteLoader loader) {
    com.agentecon.classloader.RemoteLoader prev = this.subLoaderCache.put(source, loader);
    assert (prev == null) || (loader == prev);
}