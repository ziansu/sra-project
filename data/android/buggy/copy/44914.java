@java.lang.Override
public void onAudioEncode(byte[] data, long timeUs) {
    com.wlanjie.streaming.rtmp.Rtmp.muxerAac(data, data.length, ((int) ((timeUs / 1000) - (mPresentTimeUs))));
}