public void deleteDuty(int dutyid) {
    java.lang.String filename = ("duty" + dutyid) + ".srl";
    java.io.File f = new java.io.File(((context.getFilesDir()) + (path)), filename);
    f.delete();
}