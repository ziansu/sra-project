@java.lang.Override
protected com.greatdroid.reactnative.media.player.ReactMediaPlayerView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    this.reactContext = reactContext;
    return new com.greatdroid.reactnative.media.player.ReactMediaPlayerView(reactContext);
}