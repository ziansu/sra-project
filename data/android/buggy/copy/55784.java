@java.lang.Override
public void modScale(org.randoom.setlx.utilities.Canvas canvas, double xMin, double xMax, double yMin, double yMax) {
    canvas.getFrame().modyScale(yMax, yMin);
    canvas.getFrame().modxScale(xMax, xMin);
}