public void enableIRStream() {
    if (!(IREnabled)) {
        device.enable_stream(RealSense.infrared, IRImageWidth, IRImageHeight, RealSense.y8, IRFrameRate);
        IREnabled = true;
    }
}