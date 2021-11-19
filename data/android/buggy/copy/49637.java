@java.lang.Override
public void onDestroy(boolean multitasking) {
    super.onDestroy(multitasking);
    for (java.util.Map.Entry<java.lang.String, de.neofonie.cordova.plugin.nativeaudio.NativeAudioAsset> entry : de.neofonie.cordova.plugin.nativeaudio.NativeAudio.assetMap.entrySet()) {
        de.neofonie.cordova.plugin.nativeaudio.NativeAudioAsset asset = entry.getValue();
        asset.unload();
    }
}