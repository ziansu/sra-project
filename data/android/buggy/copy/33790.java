@java.lang.Override
public int getCurrentPosition() {
    return ((int) ((mMediaExtractor.getSampleTime()) / 1000L));
}