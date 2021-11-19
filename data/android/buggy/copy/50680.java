@java.lang.Override
public boolean shutdown() {
    java.lang.System.out.println("Closing camera");
    camera.release();
    vWriter.close();
    return false;
}