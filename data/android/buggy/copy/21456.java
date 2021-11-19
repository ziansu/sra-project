@java.lang.Override
public void onCreate() {
    com.facebook.drawee.backends.pipeline.Fresco.initialize(this, com.merlin.androidtest.FImageLoaderConfig.getImagePipelineConfig(this));
    com.merlin.network.NetworkMgr.getInstance().init(this, true);
    super.onCreate();
}