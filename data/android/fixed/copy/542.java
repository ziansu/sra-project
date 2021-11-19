@io.github.alivety.conquerors.common.event.SubscribeEvent(value = SYS)
public void onLoginFailure(io.github.alivety.conquerors.client.events.LoginFailureEvent evt) {
    javax.swing.JOptionPane.showMessageDialog(null, ("Your login was not accepted: " + (evt.reason)));
    java.lang.System.exit(0);
}