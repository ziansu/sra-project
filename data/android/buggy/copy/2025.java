public static void main(java.lang.String[] args) {
    Kami.universes = new java.util.ArrayList<Universe>();
    javax.swing.JOptionPane.showMessageDialog(null, "Press 'n' to make a new planet, 'p' to pause, 'r' to reset, 'z' to zoom in and out, and 'l' to change vector lengths, 'd' to destroy or un-destroy an obect, 'SHIFT-D' to DELETE and object (forever), 'f' to force an object");
    javax.swing.JOptionPane.showMessageDialog(null, "To make another Universe, press SHIFT-C");
    Kami.makeUniverse();
}