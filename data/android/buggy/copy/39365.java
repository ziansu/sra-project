public io.github.meness.timelinepostcontainer.TimelinePostContainer setVideoPath(com.danikula.videocache.HttpProxyCacheServer proxyCacheServer, java.lang.String videoPath) {
    mVideoPath = proxyCacheServer.getProxyUrl(mVideoPath);
    return this;
}