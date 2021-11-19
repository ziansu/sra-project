public void init(org.foree.imageloader.config.ImageLoaderConfig config) {
    imageLoaderConfig = config;
    new org.foree.imageloader.base.AppInfo(imageLoaderConfig.mContext);
    checkConfig();
    mRequestQueue = new org.foree.imageloader.core.RequestQueue(imageLoaderConfig.getThreadCount());
    mRequestQueue.start();
}