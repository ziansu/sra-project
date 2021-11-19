public void read(java.io.File file) throws java.io.IOException {
    java.io.FileInputStream fis = new java.io.FileInputStream(file);
    dis = new java.io.DataInputStream(fis);
    readHead(dis);
    java.lang.System.out.println(dis.available());
}