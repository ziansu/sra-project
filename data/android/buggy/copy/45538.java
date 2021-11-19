public java.util.concurrent.Future<org.gearvrf.GVRTexture> loadFutureCompressedCubemapTexture(org.gearvrf.GVRAndroidResource resource) {
    return org.gearvrf.asynchronous.GVRAsynchronousResourceLoader.loadFutureCubemapTexture(mContext, org.gearvrf.GVRAssetLoader.mTextureCache, resource, org.gearvrf.GVRAssetLoader.DEFAULT_PRIORITY, GVRCubemapTexture.faceIndexMap);
}