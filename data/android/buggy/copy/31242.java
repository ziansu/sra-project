public void testCopyFiles() {
    java.lang.String from = "/home/miguel/Pictures/source.png";
    java.lang.String to = (imagesFolder) + "source.png";
    uy.edu.cure.servidor.central.lib.servicios.FileManagerService service = new uy.edu.cure.servidor.central.lib.servicios.impl.FileManagerServiceImpl();
    boolean actual = service.copyFile(from, to);
    assertTrue(actual);
}