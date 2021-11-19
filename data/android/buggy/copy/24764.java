@java.lang.Override
public java.lang.String getCustomText(java.lang.String description) {
    com.mpatric.mp3agic.ID3v2TXXXFrameData frameData = com.mpatric.mp3agic.ID3v2TXXXFrameData.extract(frameSets, unsynchronisation, description);
    if (frameData != null) {
        frameData.getValue().toString();
    }
    return null;
}