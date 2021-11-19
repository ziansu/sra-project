public void windowClosing(java.awt.event.WindowEvent e) {
    int i = javax.swing.JOptionPane.showConfirmDialog(frame, "Quit EsperNet IRCBot? IRC \nconnections will close.", "Warning!", javax.swing.JOptionPane.OK_CANCEL_OPTION);
    if (i == (javax.swing.JOptionPane.OK_OPTION)) {
        so101.ircbot.maskbot.IRCBot.getInstance().closeConnections();
        java.lang.System.exit(0);
    }
}