public static void main(java.lang.String[] args) {
    ImageProcessing image = new ImageProcessing("X:\\Desktop\\TEST\\4.jpg", true);
    image.RGBtoALPHA(-16777216);
    image.Save();
    image.OverlayImage("X:\\Desktop\\TEST\\run.png");
    image.Save();
}