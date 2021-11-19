public void init(org.foree.imageloader.config.ImageLoaderConfig config) {
    imageLoaderConfig = config;
    checkConfig();
    new org.foree.imageloader.base.AppInfo(imageLoaderConfig.mContext);
    mRequestQueue = new org.foree.imageloader.core.RequestQueue(imageLoaderConfig.getThreadCount());
    mRequestQueue.start();
}