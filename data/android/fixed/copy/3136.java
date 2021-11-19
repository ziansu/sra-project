public static void addFileEilter(javax.swing.JFileChooser jfc, javax.swing.filechooser.FileFilter ff) {
    jfc.removeChoosableFileFilter(jfc.getFileFilter());
    jfc.setFileFilter(ff);
}