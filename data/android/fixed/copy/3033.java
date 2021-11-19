public void removeLastFrame() {
    bin.Pixel.frames.remove(((bin.Pixel.frameNum) - 1));
    if ((bin.Pixel.frameNum) >= ((bin.Pixel.frames.size()) - 1)) {
        (bin.Pixel.frameNum)--;
    }
}