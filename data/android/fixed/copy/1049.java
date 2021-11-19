protected java.lang.String setValue(final org.jdownloader.controlling.ffmpeg.FFmpegMetaData.KEY key, java.lang.String value) {
    if (value == null) {
        return removeKey(key);
    }else {
        return values.put(key, value);
    }
}