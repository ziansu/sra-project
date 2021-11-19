@java.lang.Override
public void open(de.screenflow.frankenstein.ProcessingListener l) {
    initFrame = org.opencv.core.Mat.zeros(getWidth(), getHeight(), CvType.CV_8UC3);
}