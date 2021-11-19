private void StopWriteFile() {
    try {
        motion_writer.flush();
        motion_writer.close();
        motion_writer = null;
    } catch (java.lang.Exception e) {
    }
}