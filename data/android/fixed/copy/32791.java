public org.osmdroid.tileprovider.modules.MapTileModuleProviderBase getNextProvider() {
    mCurrentProvider = (isEmpty()) ? null : mProviderQueue.get(((index)++));
    return mCurrentProvider;
}