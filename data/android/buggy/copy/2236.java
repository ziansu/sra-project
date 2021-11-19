public boolean import_file() {
    if ((CANCELLED) == true) {
    }
    javax.swing.JOptionPane.showMessageDialog(null, net.sf.memoranda.util.Local.getString("We can not import your document."));
    return true;
}