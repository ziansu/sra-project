@java.lang.Override
public void run() {
    try {
        openConnection();
        java.lang.System.out.println(sendMove(2));
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(Opponent.Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}