public boolean singleFrameChannel(int channelIdx) {
    if ((images) == null)
        return false;
    
    return images.singleFrame(channelIdx);
}