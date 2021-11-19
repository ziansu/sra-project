@java.lang.Override
public void run() {
    try {
        openConnection();
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(Opponent.Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}