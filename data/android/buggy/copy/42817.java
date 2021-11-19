public void setOutFile(java.lang.String s) {
    try {
        outFile = new java.io.FileWriter(s);
        fos = new java.io.FileOutputStream(new java.io.File(s));
    } catch (java.io.IOException e) {
        java.lang.System.out.println("An exception occurred");
        e.printStackTrace();
    }
}