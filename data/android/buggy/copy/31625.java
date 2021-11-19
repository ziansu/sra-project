public static void main(java.lang.String[] args) throws java.io.FileNotFoundException {
    Persistence p = Persistence.init();
    Main.endingsIn = new java.io.BufferedReader(new java.io.FileReader(Main.endingsFile));
    javax.swing.SwingUtilities.invokeLater(new Window(p));
}