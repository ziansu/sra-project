@java.lang.Override
public boolean shutdown() {
    java.lang.System.out.println("Closing camera");
    camera.release();
    if ((vWriter) != null) {
        vWriter.close();
    }
    return false;
}